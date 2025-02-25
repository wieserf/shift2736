import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, resultado;
        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();
        resultado = n1 + n2;
        System.out.println("Soma = " + resultado);
        int subtracao = n1 - n2;
        System.out.println("Subtração = " + subtracao);
        double res = (double) n1 / n2;
        System.out.println("Divisão = " + res);
        resultado = n1 % n2;
        System.out.println("O resto da divisão = " + resultado);

    }
}
