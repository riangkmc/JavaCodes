package main.java.org.arquivo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\arquivos-teste\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            System.out.println("Arquivo existe? " + file.exists());
            System.out.println("Caminho absoluto: " + file.getAbsolutePath());
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error:" + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();

            }
        }
    }
}
