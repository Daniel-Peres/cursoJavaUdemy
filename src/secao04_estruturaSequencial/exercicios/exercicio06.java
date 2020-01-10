package secao04_estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        double A, B, C, pi = 3.14159;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

//        System.out.println("Entrada:");
//        System.out.printf("%.1f %.1f %.1f\n", A, B, C);
//        System.out.println("Saida:");
        System.out.printf("TRIANGULO: %.3f\n", (A * C) /2);
        System.out.printf("CIRCULO: %.3f\n", pi*(C*C));
        System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f\n", B*B);
        System.out.printf("RETANGULO: %.3f\n", A*B);
        sc.close();
    }
}
