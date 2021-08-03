package section5ConditionalStructure;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Exercise4PlayingTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start time: ");
        int startTime = sc.nextInt();

        System.out.print("Enter the end time: ");
        int endTime = sc.nextInt();

        int duration = 0;
        if (startTime < endTime) {
            duration = endTime - startTime;
        }
        else {
            duration = 24 - startTime + endTime;
        }
        System.out.println("The game lasted " + duration + " hours");
        sc.close();
    }
}
