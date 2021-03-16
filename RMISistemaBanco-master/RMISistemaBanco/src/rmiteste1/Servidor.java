/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiteste1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL-Fabio
 */
public class Servidor extends UnicastRemoteObject implements Servico{
    OperacoesBanco opBanco = new OperacoesBanco();

    public Servidor() throws RemoteException {
        super();
    }
    
    
    public static void main(String[] args)
    {
        try {
            Servidor servidor = new Servidor();
            Registry registry = LocateRegistry.createRegistry(12345);
            registry.rebind("TesteFabio",  servidor);
            System.out.println("Servidor iniciado");
            OperacoesBanco opBanco = new OperacoesBanco();
            opBanco.conectarBanco();
            
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage() );
        }
    }

    @Override
    public String getDataHora() throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return sdf.format(Calendar.getInstance().getTime());
    }

    @Override
    public String invertString(String string) throws RemoteException {
       String retorno = "";
       StringBuilder str = new StringBuilder(string);
       retorno = str.reverse().toString();
       return retorno;       
    }
     @Override
    public String cadastrarUsuario(String string) throws RemoteException {
        String retorno =string;
        try {
            opBanco.cadastrarUsuario(string);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
       return retorno;       
    }
     @Override
    public String verSaldo(String string) throws RemoteException {
        String retorno =string;
        Double saldo = 0.0;
        
        
        try {
             saldo=opBanco.verSaldo(string);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       String retorno1 = Double.toString(saldo);
     
      
         
       return retorno1;
    }
    @Override
    public String depositar(String string, String valor) throws RemoteException {
        String retorno =string;
        Double saldo = 0.0;
        
        
     
        
        try {
             saldo=opBanco.depositar(string,valor);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       String retorno1 = Double.toString(saldo);
     
      
         
       return retorno1;
    }
    @Override
    public String saquar(String string, String valor) throws RemoteException {
        String retorno =string;
        Double saldo = 0.0;
        
        
        try {
             saldo=opBanco.saquar(string,valor);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       String retorno1 = Double.toString(saldo);
     
      
         
       return retorno1;
    }
    
    @Override
    public String extrato(String string) throws RemoteException {
        String retorno ="";
        try {
            retorno= opBanco.extrato(string);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
     
      
         
       return retorno;
    }
    
    
}
