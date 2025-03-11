import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um valor para calcular o fatorial: ");
        int numero = leitor.nextInt();

        for (int i = numero; i > 1; i--){
            fatorial = i * fatorial;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
