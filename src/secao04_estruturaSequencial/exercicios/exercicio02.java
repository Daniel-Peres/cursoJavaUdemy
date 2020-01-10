package secao04_estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        double raio, area;
        double n = 3.14159;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um raio");
        raio = sc.nextDouble();
        area = n* Math.pow(raio, 2);

//        System.out.printf("Entrada: %.2f\n", raio);
//        System.out.printf("Saída: A = %.4f", area);
        System.out.printf("A=%.4f\n", area);

        sc.close();
    }
}
