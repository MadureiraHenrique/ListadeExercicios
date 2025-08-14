package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// 3) Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a
// média ponderada.

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        List<Double> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas.add(scan.nextDouble());
            System.out.println();
        }

        System.out.printf("Media: " + String.format("%.2f", media(notas)));

        scan.close();
    }

    public static double media(List<Double> nota) {
        double valorDaMedia = 0.0;
        for (Double notas : nota) {
            valorDaMedia += notas;
        }
        return valorDaMedia / 3;
    }

}
