package section04SequencialStructure;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da
//área deste círculo com quatro casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159


public class Exercise2RadiusCircle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius value of the circle: ");
        double radiusCircle = sc.nextDouble();

        double area = Math.PI * (Math.pow(radiusCircle, 2));

        System.out.printf("Area = %.4f\n", area);

        sc.close();

    }
}
