import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner doacao = new Scanner(System.in);

        double doacaoDolar, valorReais;
        System.out.println("Qual o valor da doação em dolar?: $ ");
        doacaoDolar = doacao.nextDouble();
        valorReais = doacaoDolar * 6.00;
        System.out.println("Valor recebido em reais R$" + valorReais + "\nSua doação foi realizada!");
        // \n é utilizado para pular linha

    }
}
