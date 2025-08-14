package application;

import java.util.Scanner;
import java.util.Locale;

// 9) Faça um programa que receba um valor n e em seguida informe o valor de S.
// a) s=1+1/2+1/3 +...+ 1/n
// b) s=1/n + 2/(n-1) + 3/(n-2) +...+ (n-1)/2+n
// c) s=1 - 1/2 + 1/3 - 1/4 +...+ 1/n

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o valor de n?");
        int i = scan.nextInt();

        double[] s = new double[3];

        for (int n = 1; n < i; n++) {
            s[0] += (1 + 1) / n;
            s[1] += (n - 1) / 2 + n;
            s[2] += 1 / n;
        }

        System.out.println("\nResultado");
        System.out.println("a) " + String.format("%.2f", s[0]));
        System.out.println("b) " + String.format("%.2f", s[1]));
        System.out.println("c) " + String.format("%.2f", s[2]));

        scan.close();
    }

}
