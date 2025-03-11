import java.util.Scanner;

public class BancoFiap {
    public static void main(String[] args) {
        /* Caixa Eletronico
        Utilizando a estrutura switch case, elabore um programa que leia um valor referente a uma transação bancária de acordo com as opções abaixo:
        1 - Depósito
        2 - Saque
        3 - Ver saldo
        4 - Sair
        Lembre-se: O saldo começa com 0(zero). O programa deve controlar o valor do saldo a cada depósito ou saque. Aconta pode ficar negativa.
        O usuário permanecerá no programa até digitar a opção 4 - Sair.
        * */

        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 0, valor;
        do {
            System.out.println("Bem-vindo ao Banco FIAP");
            System.out.println("\nOperações disponíveis neste caixa:" + "\n\n1 - Depósito\t\t2 - Saque" + "\n3 - Consultar saldo\t4 - Sair");
            System.out.println("opção: ");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Depósito");
                    System.out.println("Informe o valor a ser depositado R$ ");
                    valor = leitor.nextDouble();
                    saldo += valor;
                }
                case 2 -> {
                    System.out.println("Saque");
                    System.out.println("Informe o valor a ser sacado R$ ");
                    valor = leitor.nextDouble();
                    saldo -= valor;
                }
                case 3 -> {
                    System.out.println("Saldo = R$" + saldo);
                }
                case 4 -> {
                    System.out.println("Obrigado por utilizar o nosso banco!");
                }
                default -> System.out.println("Opção inválida");

            }
        }while (opcao != 4);


    }
}
