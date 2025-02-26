import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor  =   new Scanner(System.in);

        double nota01, nota02, media, frequencia;
        System.out.println("Digite a primeira nota: ");
        nota01 = leitor.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota02 = leitor.nextDouble();
        System.out.println("digite a frequencia do alune: ");
        frequencia = leitor.nextDouble();
        media = (nota01 + nota02) /2;
        if (media >= 7 && frequencia >= 75) {
            System.out.println("Aluno aprovado com média " + media);
        }
        else {
            System.out.println("Aluno reprovado com média " + media);
        }
    }
}
