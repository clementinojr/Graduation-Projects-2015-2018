/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiteste1;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import servidor2.*;
/**
 *
 * @author DELL-Fabio
 */
public class Servidor extends UnicastRemoteObject implements Servico{
    OperacoesBanco opBanco = new OperacoesBanco();
    OperacoesBanco2 opBanco2 = new OperacoesBanco2();
    

    public Servidor() throws RemoteException {
        super();
    }
    
    
    public static void main(String[] args)
    {
        try {
            Servidor servidor = new Servidor();
            Registry registry = LocateRegistry.createRegistry(12345);
            registry.bind("servidor1",  servidor);
            System.out.println("Servidor iniciado");
            OperacoesBanco opBanco = new OperacoesBanco();
            opBanco.conectarBanco();
            
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage() );
        }
    }

   
     @Override
    public String cadastrarUsuario(String string, int agencia) throws RemoteException, AccessException {
        if(agencia==2){
            Servico2 servico2 = null;
             Registry registry = LocateRegistry.getRegistry("localhost",54321);
           
           
                
            
           
          
            try {
                servico2 = (Servico2) registry.lookup("servidor2");
            } catch (NotBoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(string);
            servico2.cadastrarUsuario(string, 0);
            return string;
        }
        else{
        String retorno =string;
        try {
            opBanco.cadastrarUsuario(string);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
       return retorno;       
    }}
     @Override
    public String verSaldo(String  string, int agencia) throws RemoteException {
        
        if(agencia ==2){
            Servico2 servico2 = null;
             Registry registry = LocateRegistry.getRegistry("localhost",54321);
             
              try {
                servico2 = (Servico2) registry.lookup("servidor2");
            } catch (NotBoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(string);
              return servico2.verSaldo(string, 0);
             
            
        }
        else{
        String retorno =string;
        Double saldo = 0.0;
        
        
        try {
             saldo=opBanco.verSaldo(string,agencia);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       String retorno1 = Double.toString(saldo);
     
      
         
       return retorno1;
    }
       
    }
    @Override
    public String depositar(String string,int agencia, String valor) throws RemoteException, AccessException {
        if(agencia==2){
             Servico2 servico2 = null;
             Registry registry = LocateRegistry.getRegistry("localhost",54321);
            try {
                servico2 = (Servico2) registry.lookup("servidor2");
            } catch (NotBoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
           return servico2.depositar(string, agencia, valor);
            
        }
        else{
        
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
    }
    @Override
    public String saquar(String string, int agencia, String valor) throws RemoteException {
        
        if(agencia==2){
             Servico2 servico2 = null;
             Registry registry = LocateRegistry.getRegistry("localhost",54321);
            try {
                servico2 = (Servico2) registry.lookup("servidor2");
            } catch (NotBoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
           return servico2.saquar(string, agencia, valor);
            
        }
        else{
        
        
        String retorno =string;
        String saldo = "";
        
     
      
        try {
             saldo=opBanco.saquar(string, valor);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       String retorno1 = (saldo);
     
      
         
       return retorno1;
    }}
    
    @Override
    public String extrato(String string,int agencia) throws RemoteException, AccessException {
        if(agencia==2){
            String retorno="";
             Servico2 servico2 = null;
             Registry registry = LocateRegistry.getRegistry("localhost",54321);
            try {
                servico2 = (Servico2) registry.lookup("servidor2");
            } catch (NotBoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            
           return servico2.extrato(string,agencia);
          
            
            
        }
        else{
        String retorno1 ="";
        try {
            retorno1= opBanco.extrato(string);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
     
      
         
       return retorno1;
    }
    
    
}}
