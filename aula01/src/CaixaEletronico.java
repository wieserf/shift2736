import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*
        Valor do saque: 180
        Notas de R$50: 3
        Notas de R$20: 1
        Notas de R$10: 1
        * */

        System.out.println("Quanto deseja sacar?: ");
        int quantia = leitor.nextInt();
        int notas50, notas20, notas10;
        notas50 = quantia / 50;
        quantia = quantia % 50;
        notas20 = quantia / 20;
        quantia = quantia % 20;
        notas10 = quantia / 10;
        System.out.printf("\n%d nota(s) de R$50", notas50);
        //%d -> inteiros | %f -> double (%.2f) - 2 casas decimais
        System.out.printf("\n%d nota(s) de R$20", notas20);
        System.out.printf("\n%d nota(s) de R$10", notas10);




    }
}
