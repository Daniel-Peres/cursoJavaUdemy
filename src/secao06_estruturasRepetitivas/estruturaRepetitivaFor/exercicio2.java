package secao06_estruturasRepetitivas.estruturaRepetitivaFor;

// Exercicio 1072 do site UriJudgeOnline

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int X, Y, in=0, out=0;
        Scanner sc = new Scanner(System.in);

        X = sc.nextInt();

        for (int i = 0; i < X ; i++){

            Y = sc.nextInt();

            if(Y <= 10000) {
                if (Y >= 10 && Y <= 20){
                    in++;
                }else{
                    out++;
                }
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
        sc.close();
    }

}
