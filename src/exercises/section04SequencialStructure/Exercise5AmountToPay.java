package section04SequencialStructure;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Exercise5AmountToPay {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the code for part 1: ");
        int partCode1 = sc.nextInt();

        System.out.print("Enter the number of parts in part 1: ");
        int numberParts1 = sc.nextInt();

        System.out.print("Enter the value of each piece of part 1: ");
        double valuePart1 = sc.nextDouble();

        System.out.print("Enter the code for part 2: ");
        int partCode2 = sc.nextInt();

        System.out.print("Enter the number of parts in part 2: ");
        int numberParts2 = sc.nextInt();

        System.out.print("Enter the value of each piece of part 2: ");
        double valuePart2 = sc.nextDouble();

        double amountPayable = (numberParts1 * valuePart1) + (numberParts2 * valuePart2);
        System.out.printf("Amount payable: U$ %.2f", amountPayable);

        sc.close();

    }
}
