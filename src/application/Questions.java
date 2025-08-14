package application;

import java.util.Scanner;
import java.util.Locale;

// 7) Faça um programa em Java que receba três valores inteiros referentes ao tamanho dos três lados de um
// triângulo. Para formar um triângulo cada lado deve ser menor do que a soma dos outros dois lados. Uma vez
// verificado que os valores estão corretos (ou seja, formam um triângulo) o programa deve classifica-lo em

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double[] lados = new double[3];

        System.out.println("Veracidade de Triangulos");
        for (int i = 0; i < 3; i++) {
            System.out.print("Lado " + (i + 1) + ": ");
            lados[i] = scan.nextInt();
            System.out.println();
        }

        if ((lados[0] + lados[1]) > lados[2]
                || (lados[1] + lados[2]) > lados[0]
                || (lados[2] + lados[0]) > lados[1]) {
            System.out.println(triangulo(lados));
        } else {
            System.out.println("Não é um Triângulo");
        }

        scan.close();
    }

    // equilátero (todos os lados iguais), isósceles (dois lados iguais), escaleno
    // (todos os lados diferentes).
    public static String triangulo(double[] lado) {
        if (lado[0] == lado[1] && lado[0] == lado[2]) {
            return ("É um Triângulo Equilatero!");
        } else if (lado[0] == lado[1] || lado[1] == lado[2] || lado[0] == lado[2]) {
            return ("É um Triângulo Isósceles!");
        } else {
            return ("É um Triângulo Escaleno!");
        }
    }

}
