package section05ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

public class Exercise5BillToPay {
    public static void main(String[] args) {
        // Code             Specification                Price
        //  1                   Hot-dog                 R$ 4.00
        //  2                   X-salad                 R$ 4.50
        //  3                   X-bacon                 R$ 5.00
        //  4                   Simple toast            R$ 2.00
        //  5                   Soda                    R$ 1.50

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        int code = sc.nextInt();

        System.out.print("Enter the quantity ordered: ");
        int quantity = sc.nextInt();

        double amountPayable = 0;
        if ( code == 1) {
            amountPayable = quantity * 4.00;
        }
        else if (code == 2) {
            amountPayable = quantity * 4.50;
        }
        else if (code == 3) {
            amountPayable = quantity * 5.00;
        }
        else if (code == 4) {
            amountPayable = quantity * 2.00;
        }
        else if (code == 5) {
            amountPayable = quantity * 1.50;
        }

        System.out.printf("\nTotal: R$ %.2f", amountPayable);
        sc.close();
    }
}
