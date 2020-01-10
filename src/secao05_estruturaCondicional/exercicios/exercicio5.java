package secao05_estruturaCondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int codigo, quantidade;
        String especificacao;
        double valor, total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo){
            case 1 : {
                especificacao = "Cachorro Quente";
                valor = 4.00;
                System.out.printf("Total: R$ %.2f\n", valor * quantidade);
                break;
            }
            case 2 : {
                especificacao = "X-Salada";
                valor = 4.50;
                System.out.printf("Total: R$ %.2f\n", valor * quantidade);
                break;
            }
            case 3 : {
                especificacao = "X-Bacon";
                valor = 5.00;
                System.out.printf("Total: R$ %.2f\n", valor * quantidade);
                break;
            }
            case 4 : {
                especificacao = "Torrada Simples";
                valor = 2.00;
                System.out.printf("Total: R$ %.2f\n", valor * quantidade);
                break;
            }
            case 5 : {
                especificacao = "Refrigerante";
                valor = 1.50;
                System.out.printf("Total: R$ %.2f\n", valor * quantidade);
                break;
            }
            default: {

            }
        }
    }
}
