package rmiteste1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;


public class OperacoesBanco {
static Connection connection;
String url = "jdbc:postgresql://localhost:5432/bancoservidor";
String user = "postgres";
String password = "jmcjmjme79";

public Connection dbConnection() {
    
    try {
        
    Class.forName("org.postgresql.Driver");
    
    } catch(ClassNotFoundException e ){
              e.getMessage();
    }
    
    try {
       connection = DriverManager.getConnection(url, user, password);
        JOptionPane.showMessageDialog(null, "Connected");
    } catch (SQLException ex) {
        Logger.getLogger(OperacoesBanco.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Failed To Connect");
    }
    
    return connection;
}
 
      
    public void conectarBanco(){
      OperacoesBanco db = new OperacoesBanco();
        db.dbConnection();  
    }
public  void executa(String sql) throws SQLException{
    Statement st  = null;
    st = connection.createStatement();
    st.executeUpdate(sql);
    
}
public static void executa2() throws SQLException{
PreparedStatement stmt=connection.prepareStatement("insert into conta values(?,?)");  
 String nome = "Ju";
stmt.setString(1,nome); 
stmt.setDouble(2,101);
  
int i=stmt.executeUpdate();  
        
}
public  void cadastrarUsuario(String nome) throws SQLException{
PreparedStatement stmt=connection.prepareStatement("insert into conta values(?)");  
 
stmt.setString(1,nome); 

 
  
stmt.execute();
        
}

public  Double verSaldo(String nome, int agencia) throws SQLException{
Double saldo =0.0;


Statement stmt = connection.createStatement();
PreparedStatement sql=connection.prepareStatement("SELECT saldo \n" +
"FROM conta\n" +
"WHERE nome = ? ;");
sql.setString(1,nome); 
    
 ResultSet rs = sql.executeQuery();
while (rs.next()) {
    
    System.out.println(rs.getDouble(1));
    saldo= rs.getDouble(1);
} 
    
  return saldo;

}
    public String saquar(String nome, String valor_Saque) throws SQLException{
        String retorno= "";
        Double valorSaque = Double.parseDouble(valor_Saque);
        
        Double saldo = verSaldo(nome, 0);
        System.out.println("seu saldo"+ saldo);

    Statement stmt = connection.createStatement();

  if(valorSaque>saldo){
      Double valorAtual = verSaldo(nome,0);
      
       retorno = " SAQUE NÃO PODE SER REALIZADO. VOCE TEM DISPONIVEL: "+ valorAtual;
      
  }
  else{
       Double valorAtual = verSaldo(nome,0);
        
       
        Statement stmt3 = connection.createStatement();
        //System.out.println("Valor Disponivel:  "+valorAtual);
        //System.out.println("Valor a ser sacado:  "+valorSaque);
        PreparedStatement sql3=connection.prepareStatement("UPDATE conta  \n" +
"SET saldo = ? - ? \n" +
"WHERE nome = ? ;");
sql3.setDouble(1, valorAtual);   
sql3.setDouble(2, valorSaque);
sql3.setString(3,nome);

sql3.executeUpdate();
Double valorAtual2 = verSaldo(nome,0);
 retorno = " SAQUE REALIZADO COM SUCESSO SEU NOVO SALDO É:"+ valorAtual2;



SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
String data = sdf.format(Calendar.getInstance().getTime());
PreparedStatement sql2=connection.prepareStatement("insert into trans values(?,?,?,?)");
sql2.setString(1, nome);   
sql2.setString(2, "Saque");
sql2.setDouble(3, valorSaque);
sql2.setString(4,data);
sql2.executeUpdate();
 

      
      
  }
         
        return retorno;
    }
        
        
        
        
        
        
        
   
      public Double depositar(String nome, String valor_Deposito) throws SQLException{
        Double valorDeposito = Double.parseDouble(valor_Deposito);
        
        Double valorAtual = verSaldo(nome,0);
       
        Statement stmt = connection.createStatement();
        //System.out.println("Valor Disponivel:  "+valorAtual);
        //System.out.println("Valor a ser sacado:  "+valorSaque);
        PreparedStatement sql=connection.prepareStatement("UPDATE conta  \n" +
"SET saldo = ? + ? \n" +
"WHERE nome = ? ;");
sql.setDouble(1, valorAtual);   
sql.setDouble(2, valorDeposito);
sql.setString(3,nome);
sql.executeUpdate();

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
String data = sdf.format(Calendar.getInstance().getTime());

PreparedStatement sql2=connection.prepareStatement("insert into trans values(?,?,?,?)");
sql2.setString(1, nome);   
sql2.setString(2, "Deposito");
sql2.setDouble(3,valorDeposito);
sql2.setString(4,data);
sql2.executeUpdate();




        
        //System.out.println("Valor Atualizado: "+verSaldo(nome));
        return verSaldo(nome,0);
    }
      
      
public  String extrato(String nome) throws SQLException{


Statement stmt = connection.createStatement();
PreparedStatement sql=connection.prepareStatement("SELECT motivo,valor,data \n" +
"FROM trans\n" +
"WHERE nome = ? ;");
sql.setString(1,nome); 
String retorno = "";
    
 ResultSet rs = sql.executeQuery();
while ( rs.next() ) {
            String motivo = rs.getString("motivo");
            String  valor = rs.getString("valor");
            String  data = rs.getString("data");
            
            System.out.println( data+"Realizou um "+motivo+ "  no valor de  "+ valor );
             retorno+= (data+"Realizou um  "+motivo+ " no valor de "+ valor+"  \n");
            
          
            
         }
      return retorno;
      }
      
      


    
    
    
}