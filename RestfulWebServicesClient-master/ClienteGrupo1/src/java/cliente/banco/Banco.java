/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DELL-Fabio
 */
public class Banco {
        private String driver = "org.postgresql.Driver";
        private String user  = "postgres";
        private String senha = "jmcjmjme79";
        private String url   = "jdbc:postgresql://localhost:5432/bancoCliente";
        
        public Connection con;

        public void CriaConecta()
        {
            try{
                Class.forName(driver);
                con = null;
                con = (Connection) DriverManager.getConnection(url, user, senha);
                System.out.println("Conexão realizada com sucesso.");
            }
            catch (ClassNotFoundException ex)
            {
                System.err.print(ex.getMessage());
            } 
            catch (SQLException e)
            {
                System.err.print(e.getMessage());
            }
        }
        
}
