package section5ConditionalStructure;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercise3MultipleNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        if (num1 % num2 == 0 || num2 %  num1 == 0) {
            System.out.println("Are multiple numbers");
        }
        else {
            System.out.println("Not are multiple numbers");
        }

        sc.close();

    }
}
