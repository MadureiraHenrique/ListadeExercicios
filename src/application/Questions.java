package application;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Locale;

// 5) Faça um algoritmo em Java que receba a idade de uma pessoa e informe em qual das categorias se
// enquadra em relação à obrigatoriedade do voto:
// • Sem permissão para votar (0 a 15 anos)
// • Voto facultativo (16 a 17 anos, acima de 65 anos)
// • Voto obrigatório (18 a 64 anos)

public class Questions {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Idade:");
        System.out.println(obrigatoriedade(scan.nextInt()));
        scan.close();
    }

    public static String obrigatoriedade(int idade) {
        if (idade > 0 && idade <= 15) {
            return ("Sem permissão para votar!");
        } else if (idade > 15 && idade <= 17 || idade > 64) {
            return ("Voto facultativo!");
        } else if (idade >= 18 && idade <= 64) {
            return ("Voto obrigatório!");
        } else {
            return ("Idade Inexistente");
        }
    }

}
