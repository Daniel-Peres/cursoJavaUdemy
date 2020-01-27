package secao17_trabalhando_com_arquivos.aulas.lendoArquivo_com_File_e_Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }
        }

    }
}
