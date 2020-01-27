package secao17_trabalhando_com_arquivos.exercicio_proposto.application;

import secao17_trabalhando_com_arquivos.exercicio_proposto.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String pathIn = "F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\produtos.csv";
        String pathOut = "F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\out\\summary.csv";
        String strPath = "F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios";
        boolean success = new File(strPath + "\\out").mkdir();

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))){
            String line = br.readLine();

            while(line != null){
                String[] vect = line.split(",");
                String name = vect[0];
                double valor = Double.parseDouble(vect[1]);
                int quantidade = Integer.parseInt(vect[2]);
                list.add(new Product(name, valor, quantidade));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut, true))){
            for(Product p : list){
                bw.write(p.getName() + "," + String.format("%.2f", p.total()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Arquivo gravado com sucesso !!!");
        System.out.println("Origem: F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\produtos.csv");
        System.out.println("Destino: F:\\#Curso de Java Udemy\\#Curso_Java_Udemy\\Arquivos _Gerados_nos_exercicios\\out\\summary.csv");
    }
}
