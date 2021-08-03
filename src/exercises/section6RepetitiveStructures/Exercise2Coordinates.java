package section6RepetitiveStructures;

import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

public class Exercise2Coordinates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X and Y coordinate: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("First");
            }else if(x < 0 && y > 0){
                System.out.println("Second");
            }else if(x < 0 && y < 0){
                System.out.println("Third");
            }else if(x > 0 && y < 0){
                System.out.println("Fourth");

            }
            System.out.println("Enter the X and Y coordinate: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}

