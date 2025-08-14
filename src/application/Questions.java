package application;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

// 4) Faça um programa em Java que receba as horas de início e fim de uma atividade (expressas em horas,
// minutos e segundos) e ao final informe o tempo de duração da atividade. Dica: transforme as horas de início
// e fim em segundos, realize a subtração e em seguida volte a transformar em horas, minutos e segundos.

public class Questions {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Modelo: hora:minuto:segundo");
        System.out.print("Digite Hora, Minuto e Segundo Inicias: ");
        String tempo = scan.nextLine();

        LocalTime tempoInicial = LocalTime.parse(tempo, dtf);

        System.out.print("Digite Hora, Minuto e Segundo Finais: ");
        tempo = scan.nextLine();

        LocalTime tempoFinal = LocalTime.parse(tempo, dtf);

        Duration duracao = Duration.between(tempoInicial, tempoFinal);

        System.out.println("Duração entre " + tempoInicial + " e " + tempoFinal + ":\n"
                + duracao.toHours() + ":" + duracao.toMinutesPart() + ":" + duracao.toSecondsPart());

        scan.close();
    }

}
