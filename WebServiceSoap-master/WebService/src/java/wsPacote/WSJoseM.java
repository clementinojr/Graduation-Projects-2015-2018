/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsPacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;
import org.ObjetoC;


/**
 *
 * @author junior
 */
@WebService(serviceName = "WSJoseM")
public class WSJoseM {

 

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "ted")
    public String ted(@WebParam(name = "codigo") String codigo, @WebParam(name = "nome") String nome, @WebParam(name = "valor") double valor)  {
        String retorno ="";
        try {
            
            
       
 
             // CONEXÃO COM O BANCO 
             
            String url = "jdbc:postgresql://localhost:5432/bancoservidor";  
            String usuario = "postgres";  
            String senha = "junior";  
  
            Class.forName("org.postgresql.Driver");  
  
            Connection con;  
  
            con = DriverManager.getConnection(url, usuario, senha);  
  
            System.out.println("Conexão realizada com sucesso.");  
  
            Statement stm = con.createStatement();  
            
            //VARIAVEIS 
            
            Double saldo =0.0;
            String usuarioRetorno="";
            
            //VERIFICA USUARIO EXISTENTE
            
PreparedStatement sqlVerificaUsuario=con.prepareStatement("SELECT nome \n" +
"FROM conta\n" +
"WHERE nome = ?");
sqlVerificaUsuario.setString(1,nome);  
 ResultSet rsUsuario = sqlVerificaUsuario.executeQuery();
while (rsUsuario.next()) {
    
    System.out.println(rsUsuario.getString(1));
    usuarioRetorno= rsUsuario.getString(1);}

if(nome.equals(usuarioRetorno)){
    PreparedStatement sqlSaldo=con.prepareStatement("SELECT saldo \n" +
"FROM conta\n" +
"WHERE nome = ? ;");
sqlSaldo.setString(1,nome); 
    
 ResultSet rs = sqlSaldo.executeQuery();
while (rs.next()) {
    
    System.out.println(rs.getDouble(1));
    saldo= rs.getDouble(1);
} 

    
        // SQL DEPOSITO
          PreparedStatement sqlDeposito=con.prepareStatement("UPDATE conta  \n" +
"SET saldo = ? + ? \n" +
"WHERE nome = ? ;");
sqlDeposito.setDouble(1, valor);   
sqlDeposito.setDouble(2, saldo);
sqlDeposito.setString(3,nome);
sqlDeposito.executeUpdate();

            
            con.close();  
  
          
       
       retorno= "Depósito Efetuado";
}
    
    

else{
        retorno= "Não existe esse Usuário";
    
}
 } catch (Exception e) {
        }
            
            return retorno;

        
    }
   
    
      
        
          
         
           
      
            
        
        
    

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "correntistaOp")
    public ObjetoC correntistaOp(@WebParam(name = "codigo") String codigo)   {
        //TODO write your implementation code here:
        ObjetoC correntista = new ObjetoC();
         Double saldo = null;
         
         
         
           // CONEXÃO COM O BANCO 
             
            String url = "jdbc:postgresql://localhost:5432/bancoservidor";  
            String usuario = "postgres";  
            String senha = "junior";  
  
        try {  
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }
  
            Connection con = null;  
  
        try {  
            con = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }
  
            System.out.println("Conexão realizada com sucesso.");  
  
        try {  
            Statement stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            //Verifica Usuário
            String usuarioExistente = "";
PreparedStatement sqlVerificaUsuario = null;
        try {
            sqlVerificaUsuario = con.prepareStatement("SELECT nome \n" +
                    "FROM conta\n" +
                    "WHERE nome = ?");
        } catch (SQLException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {  
            sqlVerificaUsuario.setString(1,codigo);
        } catch (SQLException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }
 ResultSet rsUsuario = null;
        try {
            rsUsuario = sqlVerificaUsuario.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rsUsuario.next()) {
                
                System.out.println(rsUsuario.getString(1));
                usuarioExistente= rsUsuario.getString(1);}
        } catch (SQLException ex) {
            Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
        }

if(usuarioExistente.equals(codigo))
{
    PreparedStatement sqlSaldo = null;
            try {
                sqlSaldo = con.prepareStatement("SELECT saldo \n" +
                        "FROM conta\n" +
                        "WHERE nome = ? ;");
            } catch (SQLException ex) {
                Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
            }
            try { 
                sqlSaldo.setString(1,codigo);
            } catch (SQLException ex) {
                Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
            }
    
 ResultSet rs = null;
            try {
                rs = sqlSaldo.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (rs.next()) {
                    
                    System.out.println(rs.getDouble(1));
                    saldo= rs.getDouble(1); 
                }           } catch (SQLException ex) {
                Logger.getLogger(WSJoseM.class.getName()).log(Level.SEVERE, null, ex);
            }
       
     
     correntista.setNome(codigo);
     correntista.setValor(saldo);
     correntista.setCodigo(codigo);
       
      
        
        return correntista;
    
}
else{
        return null;
        }

}
            
            
            
          
            
            // SQL SALDO

    }

