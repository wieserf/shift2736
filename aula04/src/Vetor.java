import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);

        int x;
        double[] notas = new double[5]; //notas é um vetor de 5 elementos double
        String[] nomes = {"Ana", "Andre", "Eliane", "Larissa", "Fernando", "Rafaela"};
        String[] alunos = new String[5];
                    //   0   1   2   3
        int[] idades = {10, 57, 45, 27};
        System.out.println(idades[2]);
        int soma = idades[0] + idades[1] + idades[2];

        //Ler as 5 notas


        for (int i = 0; i < 5; i++){
            System.out.println("Digite a " + (i+1) + "° nota: ");
            notas[i] = leitorNumerico.nextDouble();
        }

    }
}
