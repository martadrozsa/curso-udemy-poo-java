package section05ConditionalStructure;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Exercise1NegativeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Not negative");
        }

        sc.close();
    }
}
