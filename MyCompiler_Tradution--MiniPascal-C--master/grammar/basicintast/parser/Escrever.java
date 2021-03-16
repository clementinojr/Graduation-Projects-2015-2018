/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junin
 */
public class Escrever {

    private static String file = "";
    private static String text = "";

    public static void get(String texto) {
        Escrever.text = texto;
        gravar();
    }

    public static void set(String file) {
        Escrever.file = file;
    }

    public static void gravar(){
        try{
                    File arquivo = new File(file);
        arquivo.delete();
        arquivo.createNewFile();

        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(text);

        bw.newLine();

        bw.close();
        fw.close();
        }catch(Exception e){
            
        }

    }
}
