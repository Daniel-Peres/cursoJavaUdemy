package secao08_introducaoPOO.classes_atributos_metodos;

import secao08_introducaoPOO.classes_atributos_metodos.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();
        System.out.println("Enter rectangle width and height:");
        r.height = sc.nextDouble();
        r.width = sc.nextDouble();
        System.out.println(r);

        sc.close();
    }
}
