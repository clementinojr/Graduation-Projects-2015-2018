using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FirebaseApp
{
    public class Temp
    {
        public string Status { get; set; }
        public string Comprador { get; set; }
        public string Vendedor { get; set; }
        public double Valor { get; set; }
        public bool ConfirmacaoTransacao  { get; set; }

        public Temp()
        {
            Status = "";
            Comprador = "";
            Vendedor = "";
            Valor = 0;
            ConfirmacaoTransacao = true;
        }
    }
}
