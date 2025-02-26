import java.util.Scanner;

public class MediaEncadeada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por favor, digite a idade: ");
        idade = leitor.nextInt();
        if (idade >= 18) {
            System.out.println("Voto Obrigatório");
        } else if (idade >=16) {
            System.out.println("Voto opcional");
        }
        else
            System.out.println("Não pode votar");

        if (idade < 16) {
            System.out.println();
        }
        else if (idade >= 16 && idade < 18) {
            System.out.println("Opcional");
        }
        else
            System.out.println("Obrigatório");
    }
}
