import java.util.Scanner;

public class MediaFor {
    public static void main(String[] args) {
        double somaAlturas = 0.0, media;
        int contador;
        Scanner leitor = new Scanner(System.in);

        for (contador = 1; contador <= 6; contador++){
            System.out.println("Digite a altura do " + contador + "° aluno");
            somaAlturas = somaAlturas + leitor.nextDouble();
        }
        media = somaAlturas/6;
        System.out.println("A média de altura dos alunos é de " + media);
        leitor.close();
    }
}
