package application;

import java.util.Scanner;
import java.util.Locale;

//11) Escreva um programa para ler o nome do cliente e o saldo inicial de uma conta bancária. A seguir ler um
//número indeterminado de pares de valores indicando respectivamente o tipo da operação (codificado da
//seguinte forma: 1.Depósito 2.Retirada 3.Fim) e o valor. Quando for informado para o tipo o código 3, o
//programa deve ser encerrado e impresso o saldo final da conta com as seguintes mensagens:

public class Questions {
    public static final Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        System.out.print("Qual o seu Nome? ");
        String nome = scan.nextLine();

        System.out.print("\nQual o seu Saldo Inicial? ");
        double saldoInicial = scan.nextDouble();

        System.out.println("\nEscolha uma Operação:");
        System.out.println("1.Deposito");
        System.out.println("2.Retirada");
        System.out.println("3.Fim");
        int opcao = scan.nextInt();

        System.out.println("\nDados Báncarios:");
        System.out.println("\nNome: " + nome + operacaoBancaria(opcao, saldoInicial));

        scan.close();
    }

    public static String operacaoBancaria(int opcao, double saldoAtual) {
        switch (opcao) {
            case 1:
                System.out.print("Qual o Valor a ser Depositado? ");
                double valorDeDeposito = scan.nextDouble();
                return ("\nSaldo: " + depositar(saldoAtual, valorDeDeposito));
            case 2:
                System.out.print("Qual o Valor da Retirada? ");
                double valorDeRetirada = scan.nextDouble();
                return ("\nSaldo: " + retirar(saldoAtual, valorDeRetirada));
            default:
                // CONTA ZERADA, CONTA ESTOURADA(se o saldo for negativo) ou CONTA PREFERENCIAL (se o saldo for positivo)
                if(saldoAtual > 0) {
                    return ("\nSaldo: " + saldoAtual + "\nStatus: CONTA PREFERENCIAL");
                } else if(saldoAtual == 0) {
                    return ("\nSaldo: " + saldoAtual + "\nStatus: CONTA ZERADA");
                } else {
                    return ("\nSaldo: " + saldoAtual + "\nStatus: CONTA ESTOURADA");
                }
        }
    }

    public static double depositar(double saldoAtual, double deposito) {
        return saldoAtual + deposito;
    }

    public static double retirar(double saldoAtual, double valorDeRetirada) {
        if(valorDeRetirada > saldoAtual) {
            System.out.println("ERRO: Valor de Retirada Incompativel!");
            return saldoAtual;
        } else {
            return saldoAtual - valorDeRetirada;
        }
    }

}
