package secao04_estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = horas * valorHora;

//        System.out.println("Entrada:");
//        System.out.println(numero);
//        System.out.println(horas);
//        System.out.println(valorHora);
//        System.out.println("Saida:");
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);
        sc.close();
    }

}
