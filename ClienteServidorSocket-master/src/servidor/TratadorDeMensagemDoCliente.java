/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author junin
 */
import java.io.IOException;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class TratadorDeMensagemDoCliente implements Runnable {

	private Socket cliente;
	private Servidor servidor;

	public TratadorDeMensagemDoCliente(Socket cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

	public void run() {
		try(Scanner s = new Scanner(this.cliente.getInputStream()) )
                        
               {
			while (s.hasNextLine()) {
                           
                            
                            try {
                                servidor.distribuiMensagem(this.cliente, s.nextLine());
                            } catch (SQLException ex) {
                                Logger.getLogger(TratadorDeMensagemDoCliente.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
               
	}
}