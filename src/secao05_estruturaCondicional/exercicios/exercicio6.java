package secao05_estruturaCondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        double valor;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        valor = sc.nextDouble();

        if(valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        }else if(valor <= 25){
            System.out.println("Intervalo [0,25]");
        }else if (valor <= 50){
            System.out.println("Intervalo (25,50]");
        }else if (valor <= 75){
            System.out.println("Intervalo (50,75]");
        }else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }
}
