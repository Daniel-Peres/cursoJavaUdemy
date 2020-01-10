package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;
        System.out.println("Vamos somar 2 números");
        System.out.println("Digite um número: ");
        a = sc.nextInt();
        System.out.println("Digite outro número: ");
        b = sc.nextInt();
        soma = a + b;

        System.out.println("Entrada:");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Saída:");
        System.out.println("Soma = " + soma);
    }
}