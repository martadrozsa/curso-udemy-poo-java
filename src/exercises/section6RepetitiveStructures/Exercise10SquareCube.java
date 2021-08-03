package section6RepetitiveStructures;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.

public class Exercise10SquareCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int numbers = i;
            int square = (int) Math.pow(i, 2);
            int cube = (int)Math.pow(i, 3);
            System.out.printf("%d %d %d%n", numbers, square, cube);

        }
        sc.close();
    }
}
