package secao10_comportamentoMemoria_arrays_listas;
import secao10_comportamentoMemoria_arrays_listas.entities.Estudantes;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudantes[] quartos = new Estudantes[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n; i++){
            System.out.printf("Rent #%d:\n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new Estudantes(name, email);
        }

        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++ ){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }
        sc.close();
    }
}
