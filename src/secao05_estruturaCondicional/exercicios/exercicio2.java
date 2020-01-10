package secao05_estruturaCondicional.exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if( numero%2 == 0) {
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
