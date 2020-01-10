package secao04_estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        int cod1, cod2, num1, num2;
        double valor1, valor2, total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = num1 * valor1 + num2 * valor2;

//        System.out.println("Entrada:");
//        System.out.printf("%d %d %.2f\n", cod1, num1, valor1);
//        System.out.printf("%d %d %.2f\n", cod2, num2, valor2);
//        System.out.println("Saida:");
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        sc.close();
    }

}
