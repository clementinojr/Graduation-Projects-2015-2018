/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.DAO;

import cliente.banco.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cliente.classes.Cliente;


/**
 *
 * @author junin
 */
public class ClienteDAO {
     public ClienteDAO()
    {        
    }
    
    public String inserir(Cliente cliente)
    {
        Banco banco = new Banco();
        banco.CriaConecta();
        String sql = "INSERT INTO cliente(nome,endereco,cidade,telefone) VALUES(?,?,?,?)";     
        String retorno = "false";
        try {
            PreparedStatement pst = banco.con.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getCidade());
            pst.setString(4, cliente.getTelefone());
            
        
            if(pst.executeUpdate()>0)
            {
                retorno = "ok";
            }                            
            
        } catch (SQLException ex) {
           // Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = ex.getMessage();
        }
        return retorno;
    }
    
    public String alterar(Cliente cliente)
    {
        Banco banco = new Banco();
        banco.CriaConecta();
        String sql = "UPDATE public.cliente " +
                     "   SET nome=?, endereco=?, cidade=?, telefone=? " +
                     " WHERE idcliente=? ";     
        String retorno = "false";
        try {
            PreparedStatement pst = banco.con.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getCidade());
            pst.setString(4, cliente.getTelefone());
           
            pst.setInt(5, cliente.getId());
            
            if(pst.executeUpdate()>0)
            {
                retorno = "ok";
            }                            
            
        } catch (SQLException ex) {
           // Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = ex.getMessage();
        }
        return retorno;    
    }
    
    public int delete(int ID)
    {
        Banco banco = new Banco();
        banco.CriaConecta();
        String sql = " DELETE FROM public.cliente " +
                     " WHERE idcliente = ?" ;     
        int retorno = 0;
        try {
            PreparedStatement pst = banco.con.prepareStatement(sql);
            pst.setInt(1, ID);           
            if(pst.executeUpdate()>0)
            {
                retorno = 1;
            }                            
            
        } catch (SQLException ex) {
           // Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            //retorno = ex.getMessage();
        }
        return retorno;    
    }
    
     public Cliente retornaCliente(int ID)
    {
        Cliente al = new Cliente();
        
        Banco banco = new Banco();
        banco.CriaConecta();
        String sql = " SELECT * FROM public.cliente " +
                     " WHERE idcliente = " + ID;     
        try {
            Statement st = banco.con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
      
            while (rs.next())
            {
                al.setId(rs.getInt("idcliente"));
                al.setNome(rs.getString("nome"));
                al.setEndereco(rs.getString("endereco"));
                al.setCidade(rs.getString("cidade"));
                al.setTelefone(rs.getString("telefone"));
            }
            st.close();
            
            
        } catch (Exception ex) {
           // Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;    
    }   
     
     public List<Cliente> listaCliente()
    {
        List<Cliente> lista = new ArrayList();
        
        Banco banco = new Banco();
        banco.CriaConecta();
        String sql = " SELECT * FROM public.cliente ";
        try {
            Statement st = banco.con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
      
            while (rs.next())
            {
                Cliente al = new Cliente();
                al.setId(rs.getInt("idcliente"));
                al.setNome(rs.getString("nome"));
                al.setEndereco(rs.getString("endereco"));
                al.setCidade(rs.getString("cidade"));
                al.setTelefone(rs.getString("telefone"));
                lista.add(al);
            }
            st.close();
            
            
        } catch (Exception ex) {
           // Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;    
    }   
     
}
