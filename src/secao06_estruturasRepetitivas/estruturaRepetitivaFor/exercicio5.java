package secao06_estruturasRepetitivas.estruturaRepetitivaFor;

// Exercicio 1044 do site UriJudgeOnline

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;

        for(int i = 1 ; i <= n ; i++){
            fatorial *=  i;
        }
        sc.close();
        System.out.println(fatorial);
    }
}
