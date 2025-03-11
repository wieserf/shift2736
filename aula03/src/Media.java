import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double somaAlturas = 0.0, media;

        System.out.println("Digite a altura do 1° aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 2° aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 3° aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 4° aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 5° aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 6° aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();

        media = somaAlturas/6;
        System.out.println("A media de altura dos alunos é de: ");

        leitor.close();


    }
}
