package section06RepetitiveStructures;

import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

public class Exercise3FuelFueled {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gas = 0;
        int diesel = 0;

        System.out.print("Enter a code (1, 2, 3) or 4 to stop: ");
        int code = sc.nextInt();

        while(code != 4) {
            if(code == 1) {
                alcohol++;
            }
            else if(code == 2) {
                gas++;
            }
            else if(code == 3) {
                diesel++;
            }
            System.out.print("Enter a code (1, 2, 3) or 4 to stop: ");
            code = sc.nextInt();
        }
        System.out.println("\nThank you so much");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gas: " + gas);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
