using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using FireSharp.Config;
using FireSharp.Interfaces;
using FireSharp.Response;
using Newtonsoft.Json;

namespace FirebaseApp
{
    public partial class Form1 : Form
    {
        static Usuario usuario;
        static string hashAtual;
        static Historico historicoAtual;

        IFirebaseConfig config = new FirebaseConfig()
        {
            AuthSecret = "X5vGnNfaBHP0dnUms7XMjk50O92KnfnTRxUluXE4",
            BasePath = "https://blockchain-368aa.firebaseio.com/"
        };

        IFirebaseClient client;

        public Form1()
        {
            InitializeComponent();
            client = new FireSharp.FirebaseClient(config);
        }

        private async void buttonADD_ClickAsync(object sender, EventArgs e)
        {
            if (!string.IsNullOrWhiteSpace(textNomeAd.Text) && !string.IsNullOrWhiteSpace(textCidadeAd.Text))
            {
                var data = new Temp
                {
                    Comprador = usuario.Nome,
                    Vendedor = textNomeAd.Text,
                    Valor = Double.Parse(textCidadeAd.Text),
                    ConfirmacaoTransacao = false,
                    Status = "Compra"
                };

                if (textNomeAd.Text == usuario.Nome)
                {
                    MessageBox.Show($"Não é possivel realizar tranzações contigo mesmo");
                }

                else
                {
                    FirebaseResponse response1 = await client.GetTaskAsync("Usuario/" + textNomeAd.Text);

                    if (response1.Body != "null")
                    {
                        Usuario vendedor = response1.ResultAs<Usuario>();

                        if (vendedor.IsOnline)
                        {
                            if (vendedor.Saldo >= Double.Parse(textCidadeAd.Text))
                            {
                                FirebaseResponse response2 = await client.GetTaskAsync("Temp/" + textNomeAd.Text);

                                if (response2.Body != "null")
                                {
                                    List<Temp> temps = response2.ResultAs<List<Temp>>();

                                    int cont = 0;
                                    if (temps.Any())
                                    {
                                        temps.Add(data);
                                        temps.Remove(temps[0]);

                                        foreach (var item in temps)
                                        {
                                            cont = cont + 1;
                                            FirebaseResponse setResponse = await client.UpdateTaskAsync("Temp/" + textNomeAd.Text + "/" + cont, item);

                                        }
                                    }
                                    else
                                    {
                                        SetResponse setResponse = await client.SetTaskAsync("Temp/" + textNomeAd.Text + "/" + 1, data);
                                    }
                                }
                                else
                                {
                                    SetResponse setResponse = await client.SetTaskAsync("Temp/" + textNomeAd.Text + "/" + 1, data);
                                }


                                MessageBox.Show($"Proposta para {vendedor.Nome} enviada");
                                textNomeAd.Text = "";
                                textCidadeAd.Text = "";
                            }
                            else
                            {
                                MessageBox.Show($"Usuario {vendedor.Nome} não possui saldo suficiente para realizar transações");
                            }
                        }
                        else
                        {
                            MessageBox.Show($"Usuario {vendedor.Nome} não está online para realizar transações");
                        }

                    }
                    else
                    {
                        MessageBox.Show($"Usuario {textNomeAd.Text} não consta na base");

                        textNomeAd.Text = "";
                        textCidadeAd.Text = "";
                    }
                }
            }
            else
            {
                MessageBox.Show($"Digite o nome de quem e o valor que deseja comprar");
            }
        }

        private async void buttonEdit_Click(object sender, EventArgs e)
        {
            //Busca transações pendentes para você aceitar
            FirebaseResponse response2 = await client.GetTaskAsync("Historico/" + usuario.Nome);
            List<Historico> historicos = response2.ResultAs<List<Historico>>();
            FirebaseResponse response1 = await client.GetTaskAsync("Temp/" + usuario.Nome);
            if (response1.Body != "null")
            {
                List<Temp> temps = response1.ResultAs<List<Temp>>();
                List<Temp> tempsOutros = new List<Temp>();

                int cont = 0;
                temps.Remove(temps[0]);
                historicos.Remove(historicos[0]);

                //Faz as transações
                foreach (var item in temps)
                {
                    if (item.Status == "Finalizar")
                    {
                        cont = cont + 1;
                        //compra
                        if (item.ConfirmacaoTransacao)
                        {
                            Historico historico = historicos.Last();
                            var data1 = new Historico
                            {
                                Data = DateTime.Now.ToShortDateString(),
                                Hash = Historico.GetHashString(historico.Hash),
                                HashAnterior = historico.Hash,
                                IdComprador = item.Vendedor,
                                IdVendedor = item.Comprador,
                                Valor = item.Valor
                            };
                            historicos.Add(data1);
                            usuario.Saldo = usuario.Saldo + data1.Valor;
                            var data2 = new Historico
                            {
                                Data = DateTime.Now.ToShortDateString(),
                                Hash = Historico.GetHashString(data1.Hash),
                                HashAnterior = data1.Hash,
                                IdComprador = usuario.Nome,
                                IdVendedor = usuario.Nome,
                                Valor = usuario.Saldo
                            };
                            historicos.Add(data2);

                            FirebaseResponse setResponse = await client.DeleteTaskAsync("Temp/" + usuario.Nome + "/" + cont);
                        }
                        else
                        {
                            MessageBox.Show($"Não foi possivel realizar a transação {cont} com {item.Vendedor}");
                            FirebaseResponse setResponse = await client.DeleteTaskAsync("Temp/" + usuario.Nome + "/" + cont);
                        }
                    }
                    else if (item.Status == "Compra")
                    {
                        cont = cont + 1;
                        //venda
                        if (usuario.Saldo >= item.Valor)
                        {
                            string message = $"{item.Comprador} deseja comprar {item.Valor} de monkeycoins, você aceita a transação?";
                            string caption = $"Transação {cont}";
                            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
                            DialogResult result;

                            result = MessageBox.Show(message, caption, buttons);

                            if (result == System.Windows.Forms.DialogResult.Yes)
                            {
                                Historico historico = historicos.Last();
                                var data1 = new Historico
                                {
                                    Data = DateTime.Now.ToShortDateString(),
                                    Hash = Historico.GetHashString(historico.Hash),
                                    HashAnterior = historico.Hash,
                                    IdComprador = item.Comprador,
                                    IdVendedor = item.Vendedor,
                                    Valor = item.Valor
                                };
                                historicos.Add(data1);
                                usuario.Saldo = usuario.Saldo - data1.Valor;
                                var data2 = new Historico
                                {
                                    Data = DateTime.Now.ToShortDateString(),
                                    Hash = Historico.GetHashString(data1.Hash),
                                    HashAnterior = data1.Hash,
                                    IdComprador = usuario.Nome,
                                    IdVendedor = usuario.Nome,
                                    Valor = usuario.Saldo
                                };
                                historicos.Add(data2);
                                // Closes the parent form.
                                item.ConfirmacaoTransacao = true;
                                item.Status = "Finalizar";
                                tempsOutros.Add(item);
                                FirebaseResponse setResponseYes = await client.DeleteTaskAsync("Temp/" + usuario.Nome + "/" + cont);
                            }
                            else if (result == System.Windows.Forms.DialogResult.No)
                            {
                                item.ConfirmacaoTransacao = false;
                                item.Status = "Finalizar";
                                tempsOutros.Add(item);
                                FirebaseResponse setResponseNo = await client.DeleteTaskAsync("Temp/" + usuario.Nome + "/" + cont);
                            }
                            // Seta um novo historico
                        }
                        else
                        {
                            item.ConfirmacaoTransacao = false;
                            item.Status = "Finalizar";
                            tempsOutros.Add(item);
                            MessageBox.Show($"Transação {cont} não pode ser efetuada pois voce não possui creditos, para vender");
                            FirebaseResponse setResponseNo = await client.DeleteTaskAsync("Temp/" + usuario.Nome + "/" + cont);
                        }
                    }
                }
                Historico historicofinal = historicos.Last();
                hashAtual = historicofinal.Hash;
                int cont2 = 0;

                lbl_Comprador.Text = historicofinal.IdComprador;
                lbl_hash.Text = historicofinal.Hash;
                lbl_hashAnterior.Text = historicofinal.HashAnterior;
                lbl_data.Text = historicofinal.Data;
                lbl_valor.Text = historicofinal.Valor.ToString();
                lbl_vandedor.Text = historicofinal.IdVendedor;

                lbl_hash_atual.Text = hashAtual;

                for (int i = 0; i <= tempsOutros.Count; i++)
                {
                    string name = tempsOutros[0].Comprador;
                    List<Temp> tempAux = tempsOutros.Where(a => a.Comprador == name).ToList();

                    foreach (var itemvai in tempAux)
                    {
                        tempsOutros.Remove(itemvai);
                    }

                    List<Temp> tempAux2 = new List<Temp>();
                    FirebaseResponse res = await client.GetTaskAsync("Temp/" + name);
                    if (res.Body != "null")
                    {
                        tempAux2.AddRange(res.ResultAs<List<Temp>>());
                        tempAux2.Remove(tempAux2[0]);
                        tempAux.AddRange(tempAux2);
                    }
                    int coint = 0;

                    foreach (var item2 in tempAux)
                    {
                        coint = coint + 1;
                        FirebaseResponse setResponse = await client.UpdateTaskAsync("Temp/" + name + "/" + coint, item2);

                    }
                }

                foreach (var item in historicos)
                {
                    cont2 = cont2 + 1;
                    FirebaseResponse setResponse = await client.UpdateTaskAsync("Historico/" + usuario.Nome + "/" + cont2, item);
                }

                FirebaseResponse setResponseUsu = await client.UpdateTaskAsync("Usuario/" + usuario.Nome, usuario);
            }
            else
            {
                MessageBox.Show($"Voce não possui tranzações pendentes");
            }
            //Busca transações pendentes para voce fazer update
            //FirebaseResponse response3 = await client.GetTaskAsync("Temp");
            //var pend = response3.ResultAs<List<Temp>>();

            //Set a ultima tranzação
        }

        private async void btnConect_ClickAsync(object sender, EventArgs e)
        {
            if (!string.IsNullOrWhiteSpace(textNameConect.Text))
            {
                FirebaseResponse response1 = await client.GetTaskAsync("Usuario/" + textNameConect.Text);
                if (response1.Body != "null")
                {
                    Usuario usuarios = response1.ResultAs<Usuario>();

                    usuarios.IsOnline = true;
                    usuario = usuarios;

                    SetResponse setResponse = await client.SetTaskAsync("Usuario/" + textNameConect.Text, usuario);
                    Usuario result = setResponse.ResultAs<Usuario>();

                    usuario = result;

                    FirebaseResponse response2 = await client.GetTaskAsync("Historico/" + textNameConect.Text);
                    List<Historico> historicos = response2.ResultAs<List<Historico>>();

                    historicoAtual = historicos.Last();

                    hashAtual = historicoAtual.Hash;

                    lbl_Comprador.Text = historicoAtual.IdComprador;
                    lbl_hash.Text = historicoAtual.Hash;
                    lbl_hashAnterior.Text = historicoAtual.HashAnterior;
                    lbl_data.Text = historicoAtual.Data;
                    lbl_valor.Text = historicoAtual.Valor.ToString();
                    lbl_vandedor.Text = historicoAtual.IdVendedor;

                    lbl_hash_atual.Text = hashAtual;

                    MessageBox.Show($"Usuario {result.Nome} conectado");
                }
                else
                {
                    var data = new Usuario
                    {
                        Nome = textNameConect.Text,
                        Saldo = 50,
                        IsOnline = true
                    };

                    SetResponse setResponse = await client.SetTaskAsync("Usuario/" + textNameConect.Text, data);
                    Usuario result = setResponse.ResultAs<Usuario>();

                    var data2 = new Historico
                    {
                        Hash = Historico.GetHashString(data.Nome),
                        Data = DateTime.Now.ToShortDateString(),
                        HashAnterior = "",
                        IdComprador = data.Nome,
                        IdVendedor = "Monkey bank",
                        Valor = 50
                    };

                    SetResponse setResponse2 = await client.SetTaskAsync("Historico/" + textNameConect.Text + "/" + 1, data2);

                    lbl_Comprador.Text = data2.IdComprador;
                    lbl_hash.Text = data2.Hash;
                    lbl_hashAnterior.Text = data2.HashAnterior;
                    lbl_data.Text = data2.Data;
                    lbl_valor.Text = data2.Valor.ToString();
                    lbl_vandedor.Text = data2.IdVendedor;

                    hashAtual = data2.Hash;

                    lbl_hash_atual.Text = hashAtual;

                    MessageBox.Show($"Usuario {result.Nome} criado com sucesso, você ganhou 50 monkeycoins");

                    usuario = result;

                }

                textNomeAd.Enabled = true;
                textCidadeAd.Enabled = true;
                buttonADD.Enabled = true;
                buttonEdit.Enabled = true;

                textNameConect.Text = "";
                textNameConect.Enabled = false;
                btnConect.Enabled = false;
            }
            else
            {
                MessageBox.Show($"Digite o nome do usuario para conectar");
            }
        }
    }
}
