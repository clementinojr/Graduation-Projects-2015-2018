/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor2;

import servidor2.*;
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
import rmiteste1.*;
/**
 *
 * @author DELL-Fabio
 */
public class Servidor2 extends UnicastRemoteObject implements Servico2{
    OperacoesBanco opBanco = new OperacoesBanco();
    OperacoesBanco2 opBanco2 = new OperacoesBanco2();
    

    public Servidor2() throws RemoteException {
        super();
    }
    
    
    public static void main(String[] args)
    {
        try {
            Servidor2 servidor2 = new Servidor2();
            Registry registry = LocateRegistry.createRegistry(54321);
            registry.bind("servidor2",  servidor2);
            System.out.println("Servidor iniciado");
            OperacoesBanco2 opBanco2 = new OperacoesBanco2();
            opBanco2.conectarBanco();
            
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage() );
        }
    }

   
     @Override
    public String cadastrarUsuario(String string, int agencia) throws RemoteException, AccessException {
        if(agencia==1){
            Servidor servidor = new Servidor();
           
                
            
            Registry registry = LocateRegistry.getRegistry("localhost",12345);
            try {
                Servico servico = (Servico) registry.lookup("servidor1");
            } catch (NotBoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                opBanco.cadastrarUsuario(string);
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
            return string;
        }
        else{
            
        String retorno =string;
        try {
            System.out.println(string);
            opBanco2.cadastrarUsuario(string, 0);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
       return retorno;       
    }}
     @Override
    public String verSaldo(String  string, int agencia) throws RemoteException {
         String retorno =string;
         Double saldo = 0.0;
        if(agencia==1){
            Servidor servidor = new Servidor();
            Registry registry = LocateRegistry.getRegistry("localhost",12345);
            
            try {
                saldo= opBanco.verSaldo(string,0 );
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
            return saldo.toString();
        }
        else{
        
         try {
                saldo= opBanco2.verSaldo(string,0 );
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
       
       String retorno1 = Double.toString(saldo);
       return retorno1;
        }}
    @Override
    public String depositar(String string,int agencia, String valor) throws RemoteException {
        String retorno =string;
        Double saldo = 0.0;
        if(agencia==1){
            Servidor servidor = new Servidor();
            Registry registry = LocateRegistry.getRegistry("localhost",12345);
            
            try {
                saldo= opBanco.depositar(string, valor);
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
            return saldo.toString();
            
        }
        
     
        
        else {
            try {
                saldo=opBanco2.depositar(string,valor);
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
     
      
         
       return saldo.toString();
    }
    @Override
    public String saquar(String string, int agencia, String valor) throws RemoteException {
        String saldo = "";
       if(agencia==1){
           Servidor servidor = new Servidor();
            Registry registry = LocateRegistry.getRegistry("localhost",12345);
           try {
               saldo= opBanco.saquar(string, valor);
           } catch (SQLException ex) {
               Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
           }
           return saldo;
       }
        
        
        
        
        try {
             saldo=opBanco2.saquar(string,valor);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
        }
       String retorno1 = (saldo);
     
      
         
       return retorno1;
    }
    
    @Override
    public String extrato(String string,int agencia) throws RemoteException {
        if(agencia==1){
            String retorno ="";
             Servidor servidor = new Servidor();
            Registry registry = LocateRegistry.getRegistry("localhost",12345);
            try {
                retorno= opBanco.extrato(string);
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
            return retorno;
           
            
        }
     
        else{
            String retorno2 ="";
            try {
                opBanco2.extrato(string);
            } catch (SQLException ex) {
                Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
            }
          return retorno2 ;  
    }
      
      
    
    
    
}}
