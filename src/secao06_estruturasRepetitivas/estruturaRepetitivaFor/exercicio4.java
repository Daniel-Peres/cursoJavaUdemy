package secao06_estruturasRepetitivas.estruturaRepetitivaFor;

// Exercicio 1044 do site UriJudgeOnline

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++ ){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                double resultado = (double) x / y;
                System.out.printf("%.1f\n", resultado);
            }
        }
        sc.close();
    }
}
