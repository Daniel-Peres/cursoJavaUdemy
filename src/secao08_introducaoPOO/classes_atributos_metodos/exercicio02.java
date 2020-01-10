package secao08_introducaoPOO.classes_atributos_metodos;

import secao08_introducaoPOO.classes_atributos_metodos.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee f = new Employee();

        System.out.print("Name: ");
        f.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        f.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        f.tax = sc.nextDouble();

        System.out.println(f);

        System.out.print("\nWich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        f.increaseSalary(percentage);
        System.out.println("\nUpdated data: " + f.name + ", $ " + String.format("%.2f", f.netSalary()));
        sc.close();
    }
}
