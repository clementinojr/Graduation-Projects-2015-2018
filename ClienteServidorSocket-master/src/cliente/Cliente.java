/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author junin
 */
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    private String host;
	private int porta;
         private int op1;
         private String nome_novousuario;
         private String usuario;
           private String usuario2;
           private String usuario3;
           private double saque;
           private double deposito;
         
         

	public Cliente(String host, int porta) {
		this.host = host;
		this.porta = porta;
	}

	public void executa() throws UnknownHostException, IOException {
		try(Socket cliente = new Socket(this.host, this.porta); 
				Scanner teclado = new Scanner(System.in); 
                                
				PrintStream saida = new PrintStream(cliente.getOutputStream())) {
			System.out.println("O cliente se conectou ao servidor!");
	
			RecebedorDeMensagemDoServidor r = new RecebedorDeMensagemDoServidor(cliente.getInputStream());
			new Thread(r).start();
                        System.out.println("Menu");
                        while(true){ 
                        System.out.println("[1]Cadastrar usuario      [2]Consultar saldo      [3]Saque     [4]Deposito       [5]Sair    ");
   
                       
                      int op1  = teclado.nextInt();
                     
                       switch (op1) {
            case 1:
                System.out.println("Digite o nome do usuario");
                teclado.hasNext();
                saida.println("1;"+teclado.next());
                break;
            case 2:
                System.out.println("Ver saldo: Digite o nome do usuario atribuido a conta");
                teclado.hasNext();
                saida.println("2;"+teclado.next());
                
                
                
                break;
            case 3:
                System.out.println("Saque:Digite o nome do usuario atribuido a conta");
                 String usuario2  = teclado.next();
                 System.out.println("Digite o valor a ser sacado:");
                 String saque = teclado.next();
                 saida.println("3;"+usuario2+";"+saque);
                break;
            case 4:
                 System.out.println("Deposito:Digite o nome do usuario atribuido a conta");
                 String usuario3  = teclado.next();
                 System.out.println("Digite o valor a ser depositado:");
                 String deposito = teclado.next();
                 saida.println("4;"+usuario3+";"+deposito);
                break;
            case 5: 
                System.exit(0);
                break;
            default:
                 System.out.println("Este não é uma operação válida dia válido!");
         }
                        
                        
			/*while (teclado.hasNextLine()) {
                           
				saida.println(teclado.nextLine());
			}*/
		}}
	}
    
}
