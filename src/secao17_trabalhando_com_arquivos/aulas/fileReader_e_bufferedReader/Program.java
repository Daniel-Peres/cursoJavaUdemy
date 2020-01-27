package secao17_trabalhando_com_arquivos.aulas.fileReader_e_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String path = "F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
