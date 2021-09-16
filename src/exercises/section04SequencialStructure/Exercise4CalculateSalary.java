package section04SequencialStructure;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.


public class Exercise4CalculateSalary {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee number: ");
        int employeeNumber = sc.nextInt();

        System.out.print("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Enter the amount paid per hour: ");
        double amountPaid = sc.nextDouble();

        double salary = hoursWorked * amountPaid;
        System.out.println("Number: " + employeeNumber);
        System.out.printf("Salary: U$ %.2f", salary);

        sc.close();

    }
}
