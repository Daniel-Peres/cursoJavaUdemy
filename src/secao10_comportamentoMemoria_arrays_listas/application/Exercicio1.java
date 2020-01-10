package secao10_comportamentoMemoria_arrays_listas.application;


import secao10_comportamentoMemoria_arrays_listas.entities.Emplooye1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Emplooye1> employees = new ArrayList<>();

        System.out.print("\nHow many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("\nEmplyoee #%d:\n", i);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            employees.add(new Emplooye1(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Emplooye1 emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            Double percentagem = sc.nextDouble();
            emp.increaseSalary(percentagem);
        }

        System.out.println("\nList of employees:");
        for (Emplooye1 x : employees) {
            System.out.println(x);
        }









        sc.close();


    }
}
