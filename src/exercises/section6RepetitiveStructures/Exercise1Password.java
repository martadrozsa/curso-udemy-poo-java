package section6RepetitiveStructures;

import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

public class Exercise1Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        int password = sc.nextInt();

        int validPassword = 2002;

        while (password != validPassword) {
            System.out.print("Invalid password ");
            password = sc.nextInt();
        }

        System.out.println("Access allowed");

        sc.close();
    }
}
