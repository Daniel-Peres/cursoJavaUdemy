package secao10_comportamentoMemoria_arrays_listas.application;

import secao10_comportamentoMemoria_arrays_listas.entities.Employee;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> empregados = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.printf("\nEmplyoee #%d:\n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            empregados.add(new Employee(id, nome, salario));
        }

        System.out.print("\nEnter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee emp = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Employee x : empregados) {
            System.out.println(x);
        }
        sc.close();
    }
}
