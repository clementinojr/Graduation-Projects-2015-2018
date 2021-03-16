package servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;


public class OperacoesBanco {
static Connection connection;
String url = "jdbc:postgresql://localhost:5432/bancoservidor";
String user = "postgres";
String password = "senhaBanco";

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

public  Double verSaldo(String nome) throws SQLException{
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
    public Double saquar(String nome, String valor_Saque) throws SQLException{
        Double valorSaque = Double.parseDouble(valor_Saque);
        
        Double valorAtual = verSaldo(nome);
       
        Statement stmt = connection.createStatement();
        //System.out.println("Valor Disponivel:  "+valorAtual);
        //System.out.println("Valor a ser sacado:  "+valorSaque);
        PreparedStatement sql=connection.prepareStatement("UPDATE conta  \n" +
"SET saldo = ? - ? \n" +
"WHERE nome = ? ;");
sql.setDouble(1, valorAtual);   
sql.setDouble(2, valorSaque);
sql.setString(3,nome);
sql.executeUpdate();

        
        //System.out.println("Valor Atualizado: "+verSaldo(nome));
        return verSaldo(nome);
    }    
      public Double depositar(String nome, String valor_Deposito) throws SQLException{
        Double valorDeposito = Double.parseDouble(valor_Deposito);
        
        Double valorAtual = verSaldo(nome);
       
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

        
        //System.out.println("Valor Atualizado: "+verSaldo(nome));
        return verSaldo(nome);
    }    


    
    
    
}