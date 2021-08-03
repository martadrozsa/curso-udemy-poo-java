package section4SequencialStructure;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Exercise6CalculateArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of B: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of C: ");
        double c = sc.nextDouble();

        double triangleArea = (a * c) / 2;
        double circleArea = Math.PI * (Math.pow(c, 2));
        double trapezoidArea = ((a + b) * c) / 2;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.printf("\nTriangle area: %.3f\n", triangleArea);
        System.out.printf("Circle area: %.3f\n", circleArea);
        System.out.printf("Trapezoid area: %.3f\n", trapezoidArea);
        System.out.printf("Square area: %.3f\n", squareArea);
        System.out.printf("Rectangle area: %.3f\n", rectangleArea);

        sc.close();

    }
}
