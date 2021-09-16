package section06RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class Exercise7Division {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        double division = 0;
        for (int i = 0; i < n; i ++) {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            double denominator = sc.nextDouble();

            if (denominator == 0) {
                System.out.println("Impossible division");
            }
            else {
                division = numerator / denominator;
                System.out.printf("Division = %.1f\n", division);
            }

        }
    }
}
