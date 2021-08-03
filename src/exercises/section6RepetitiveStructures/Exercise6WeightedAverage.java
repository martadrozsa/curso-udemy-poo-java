package section6RepetitiveStructures;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

import java.util.Locale;
import java.util.Scanner;

public class Exercise6WeightedAverage {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int n = sc.nextInt();

        System.out.println("Enter the test case number: ");
        double average = 0;
        for (int i = 0; i < n; i++) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            average = (num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10.0;
            System.out.printf("Average %.1f", average);
        }

        sc.close();

    }
}
