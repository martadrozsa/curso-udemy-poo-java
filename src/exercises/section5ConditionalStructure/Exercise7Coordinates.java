package section5ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
//A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

public class Exercise7Coordinates {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        double x = sc.nextDouble();

        System.out.print("Enter the value of Y: ");
        double y = sc.nextDouble();


        if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrant = Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrant = Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrant = Q3");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Quadrant = Q4");
        }
        else if (x == 0.0 && y == 0.0) {
            System.out.println("Origen");
        }
        else if (y == 0.0) {
            System.out.println("Axis X");
        }
        else if (x == 0.0) {
            System.out.println("Axis Y");
        }
        sc.close();
    }
}
