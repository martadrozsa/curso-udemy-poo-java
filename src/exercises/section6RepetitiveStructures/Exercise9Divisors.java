package section6RepetitiveStructures;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class Exercise9Divisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}