package servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Servidor {
    
    OperacoesBanco conexaoBanco = new OperacoesBanco();

	private int porta;
	private List<Socket> clientes;

	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<>();
	}

	public void executa() throws IOException  {
		try(ServerSocket servidor = new ServerSocket(this.porta)){
			System.out.println("Porta 12345 aberta!");
                        conexaoBanco.conectarBanco();
	
			while (true) {
				Socket cliente = servidor.accept();
				System.out.println("Nova conexão com o cliente " + 
						cliente.getInetAddress().getHostAddress());
	
				this.clientes.add(cliente);
	
				TratadorDeMensagemDoCliente tc = new TratadorDeMensagemDoCliente(cliente, this);
				new Thread(tc).start();
			}
		}
	}

	public void distribuiMensagem(Socket clienteQueEnviou, String msg ) throws SQLException {
            
		for (Socket cliente : this.clientes) {
			if(cliente.equals(clienteQueEnviou)){
				try {
					PrintStream ps = new PrintStream(cliente.getOutputStream());
					//ps.println(msg);
                                        String valor[] = msg.split(";");
                                        System.out.println(valor[0]);
                                         System.out.println(valor[1]);
                                         
                                         
                                         
                                         
          //valor[0] = 1  --Cadastrar cliente 
                                        if("1".equals(valor[0])){
                                            
                                        conexaoBanco.cadastrarUsuario(valor[1]);
                                            ps.println("Cadastro Realizado com Sucesso");
                                        }
                                        
                                        
     //valor[0] = 2  --Ver Saldo Cliente
                                        if("2".equals(valor[0])){
                                            ps.print("Saldo:");
                                         
                                            ps.println( conexaoBanco.verSaldo(valor[1]));
                                        }
                                            
     //valor[0] = 3 -- Saque do Cliente
                                        
                                         if("3".equals(valor[0])){
                                             
                                            
                                           
                                          
                                            ps.println("Saque realizado com sucesso. Seu Saldo atual eh: "+conexaoBanco.saquar(valor[1],valor[2] ));
                                        }
  //valor[0] = 4 -- Deposito do Cliente
                                         if("4".equals(valor[0])){
                                            ps.println("Deposito realizado com sucesso. Seu Saldo atual eh: "+conexaoBanco.depositar(valor[1],valor[2] ));
                                        }
                                        
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}   
        


