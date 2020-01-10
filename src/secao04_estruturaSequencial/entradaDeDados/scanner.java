package secao04_estruturaSequencial.entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // se estiver setado tem que digitar com ponto
        Scanner sc = new Scanner(System.in);

//        String x;
//        x = sc.next();
//        System.out.println("Você digitou: " + x);
//
//        int y;
//        y = sc.nextInt();
//        System.out.println("Você digitou: " + y);
//
//
//        double z;
//        z = sc.nextDouble();
//        System.out.println("Você digitou: " + z);
//        System.out.printf("Você digitou: %.2f\n", z);
//
//        char w;
//        w = sc.next().charAt(0);
//        System.out.println("Você digitou: " + w);

//        String xx;
//        int yy;
//        double zz;
//        xx = sc.next();
//        yy = sc.nextInt();
//        zz = sc.nextDouble();
//        System.out.printf("Dados digitados: \n%s\n%d\n%.2f", xx, yy, zz);

        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Dados digitados");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
