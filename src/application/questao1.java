package application;

import java.util.Locale;
import java.util.Scanner;

// 2) Faça um programa em Java que solicite a hora atual (expressa em horas, minutos e segundos) ao usuário e
// informe quantos segundos do dia já passaram.

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite as Horas: ");
        int horas = scan.nextInt(); 

        System.out.print("Digite os Minutos: ");
        int minutos = scan.nextInt();
        minutos += (horas * 60);

        System.out.print("Digite os Segundos: ");
        int segundos = scan.nextInt();

        double totalDeSegundos = (minutos * 60) + segundos;

        System.out.println("O Total de Segundos é: " + String.format("%.2f", totalDeSegundos));

    }
}
