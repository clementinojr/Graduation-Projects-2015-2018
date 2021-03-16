/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiteste1;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author DELL-Fabio
 */
public interface Servico extends Remote{
    public String getDataHora() throws RemoteException;
    public String invertString(String string) throws RemoteException;
    public String cadastrarUsuario(String string) throws RemoteException;
    public String verSaldo(String string) throws RemoteException;
    public String depositar(String string, String valor) throws RemoteException;
    public String saquar(String string, String valor) throws RemoteException;
    public String extrato(String string) throws RemoteException;
}

