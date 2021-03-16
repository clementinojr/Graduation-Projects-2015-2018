/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor2;
import rmiteste1.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author DELL-Fabio
 */
public interface Servico2 extends Remote{
   
    public String cadastrarUsuario(String string, int agencia) throws RemoteException;
    public String verSaldo(String nome, int agencia) throws RemoteException;
    public String depositar(String nome,int agencia, String valor) throws RemoteException;
    public String saquar(String nome,int agencia, String valor) throws RemoteException;
    public String extrato(String nome, int agencia) throws RemoteException;
}

