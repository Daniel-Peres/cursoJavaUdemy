package secao06_estruturasRepetitivas.estruturaRepetitivaFor;
// Exercicio 1067 do site UriJudgeOnline

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int X;
        Scanner sc = new Scanner(System.in);

        X = sc.nextInt();

        for (int i = 0; i <= X ; i++){

            if(X <= 1 || X <= 1000) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();

    }
}
