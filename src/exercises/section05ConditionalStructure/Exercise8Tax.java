package section05ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;


//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.


public class Exercise8Tax {
    public static void main(String[] args) {

        //      Income                           Income tax
        //  0.00 to 2000.00                         Exempt
        //  2000.01 to 3000.00                         8%
        //  3000.01 to 4500.00                         18%
        //  above 4500.00                              28%

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of the salary: ");
        double salary = sc.nextDouble();

        double income = 0;
        if (salary > 0.00 && salary < 2000.00) {
            income = 0.0;
        }
        else if (salary > 2000.01 && salary < 3000.00) {
            income = (salary - 2000.00) * 0.08;
        }
        else if (salary > 3000.01 && salary < 4500.00) {
            income = (salary - 3000.00) * 0.18 + 1000.0 * 0.08;
        }
        else if (salary > 4500.00) {
            income = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (income == 0) {
            System.out.println("Exempt");
        }
        else {
            System.out.printf("\nTotal payable: R$ %.2f\n", income);
        }

        sc.close();
    }
}
