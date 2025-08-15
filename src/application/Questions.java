package application;

import java.util.Scanner;
import java.util.Locale;

// 10)Faça um programa que receba um número e informe se é um termo da sequência de Fibonacci. Na
// sequência de Fibonacci cada termo é a soma dos dois termos anteriores:
// 1, 1, 2, 3, 5, 8, 13...

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Quantos números o Fibonacci deve ter? ");
        sequenciaDeFibonacci(scan.nextInt());
        scan.close();
    }

    public static void sequenciaDeFibonacci(int quantidade) {
        int[] fibonacci = new int[quantidade];
        fibonacci[2] = 1;
        for (int i = 0; i < quantidade; i++) {
            fibonacci[0] = fibonacci[1];
            fibonacci[1] += fibonacci[2];
            System.out.print(fibonacci[1] + ", ");
            fibonacci[2] = fibonacci[0];
        }
        System.out.print("(...)");
    }

}
