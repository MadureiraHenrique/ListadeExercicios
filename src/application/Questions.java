package application;

import java.util.Scanner;
import java.util.Locale;

// 8) A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa em Java que
// receba o enquadramento do professor e a quantidade de horas trabalhadas, calcule e exiba o salário do
// professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Qual o seu Nivel? ");
        int nivel = scan.nextInt();

        System.out.print("\nQuantas Horas Trabalhas? ");
        int horas = scan.nextInt();

        System.out.println("\nValor Total: " + valorTotal(horas, enquadramento(nivel)));

        scan.close();
    }

    // Enquadramento Valor da hora/aula
    // Nível 1 R$12,00
    // Nível 2 R$17,00
    // Nível 3 R$25,00
    public static int enquadramento(int nivel) {
        if (nivel == 1) {
            return (12);
        } else if (nivel == 2) {
            return (17);
        } else if (nivel == 3) {
            return (25);
        } else {
            System.out.println("Nivel Inválido");
            return (0);
        }
    }

    public static double valorTotal(int horasTrabalhadas, int valorNivel) {
        return horasTrabalhadas * valorNivel;
    }

}
