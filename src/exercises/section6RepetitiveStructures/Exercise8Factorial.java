package section6RepetitiveStructures;

import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial.
//Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

public class Exercise8Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}
