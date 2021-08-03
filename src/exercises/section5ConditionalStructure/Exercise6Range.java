package section5ConditionalStructure;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Locale;
import java.util.Scanner;

public class Exercise6Range {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();


        if (number < 0.0 || number > 100.0){
            System.out.println("Out of range");
        }
        else if (number > 0.0 && number <= 25.0) {
            System.out.println("Range [0 - 25]");
        }
        else if (number <= 50.0) {
            System.out.println("Range [25 - 50]");
        }
        else if (number <= 75.0) {
            System.out.println("Range [50 - 75]");
        }
        else if (number <= 100.0) {
            System.out.println("Range [75 - 100]");
        }
        sc.close();

    }
}
