package secao08_introducaoPOO.classes_atributos_metodos;

import secao08_introducaoPOO.classes_atributos_metodos.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        s.name = sc.nextLine();
        s.nota1 = sc.nextDouble();
        s.nota2 = sc.nextDouble();
        s.nota3 = sc.nextDouble();

        System.out.println(s.aprovado());
        sc.close();
    }
}
