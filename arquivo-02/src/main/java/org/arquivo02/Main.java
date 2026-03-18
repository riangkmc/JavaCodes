package main.java.org.arquivo02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static void main(String[] args) {
        String[] lines = new String[3];
        lines[0] = "irei so adicionar agr!";
        lines[1] = "bom dia";
        lines[2] = "ola";

        String path = "C:\\arquivos-teste\\cria.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
