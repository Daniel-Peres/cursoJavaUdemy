package secao17_trabalhando_com_arquivos.aulas.fileWriter_e_bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night" };

        String path = "F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
