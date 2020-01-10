package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if( numero < 0) {
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NAO NEGATIVO");
        }
        sc.close();
    }
}
