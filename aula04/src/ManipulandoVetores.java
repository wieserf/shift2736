import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] alunos = {"Fernando", "Samira", "Rafael", "Isabella", "Thais", "Yuri"};
        System.out.println("Exibindo os elementos do vetor");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
        System.out.println("----------------------\nOrdenando o vetor\n");
        Arrays.sort(alunos);
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }
}
