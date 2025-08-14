package application;

import java.util.Scanner;

// 1) Faça um programa em Java que receba uma temperatura em centígrados e transforme para fahrenheit.
// Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor em Graus:");
        double fahrenheit = scan.nextDouble();

        System.out.print("O valor total é: " + calculo(fahrenheit));
    }

    public static double calculo(double fahrenheit) {
        return ((9 * fahrenheit) + 160) / 5;
    }
}
