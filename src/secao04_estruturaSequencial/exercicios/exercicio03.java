package secao04_estruturaSequencial.exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = (A * B - C * D);

        System.out.println("ENTRADA:");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println("SAÍDA:");
        System.out.println("DIFERENCA = " + DIFERENCA);
        sc.close();
    }
}
