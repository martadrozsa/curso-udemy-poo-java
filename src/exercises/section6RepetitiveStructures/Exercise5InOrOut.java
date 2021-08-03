package section6RepetitiveStructures;

import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

public class Exercise5InOrOut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers to be checked: ");
        int n = sc.nextInt();



        int in = 0;
        int out = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            }
            else {
                out++;
            }

        }
        System.out.println("\n" + in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
