package main.java.org.arquivo01;

import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = ("C:\\arquivos-teste\\in.txt");


        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line !=null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
