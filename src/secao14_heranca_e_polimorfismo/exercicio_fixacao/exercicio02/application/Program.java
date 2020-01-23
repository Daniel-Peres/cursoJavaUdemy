package secao14_heranca_e_polimorfismo.exercicio_fixacao.exercicio02.application;

import secao14_heranca_e_polimorfismo.exercicio_fixacao.exercicio02.entities.Company;
import secao14_heranca_e_polimorfismo.exercicio_fixacao.exercicio02.entities.Individual;
import secao14_heranca_e_polimorfismo.exercicio_fixacao.exercicio02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the numbers of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if( type == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for(TaxPayer tax : list){
            sum += tax.tax();
            System.out.println(
                    tax.getName()
                    + ": $ "
                    + String.format("%.2f", tax.tax())
            );
        }
        System.out.println("\nTOTAL TAXES: $ "+ sum);

        sc.close();
    }
}
