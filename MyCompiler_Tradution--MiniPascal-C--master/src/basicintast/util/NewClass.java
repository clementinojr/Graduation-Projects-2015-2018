/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author junin
 */
public class NewClass {
   public static void texto(String texto) throws IOException {
       File arquivo = new File( "nome_do_arquivo.txt" );
       arquivo.createNewFile();
    
FileWriter fw = new FileWriter(arquivo, true);
 
BufferedWriter bw = new BufferedWriter(fw);
 
bw.write(texto);
 
bw.newLine();
 
bw.close();
fw.close();
    }
        
    }
    

