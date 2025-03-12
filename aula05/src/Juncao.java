import java.util.ArrayList;

public class Juncao {
    public static void main(String[] args) {
        //Ler 2 vetores (A, B) de inteiros com 4 posições
        //Criar um 3° vetor que é a junção dos dois
        //Criar um 4° vetor que será o vetor A invertido


        ArrayList<Integer> vetorA = new ArrayList<>();
        vetorA.add(1);
        vetorA.add(2);
        vetorA.add(3);
        vetorA.add(4);
        vetorA.add(5);
        for (Integer vetA : vetorA){
            System.out.println(vetA);
        }

        ArrayList<Integer> vetorB = new ArrayList<>();
        vetorB.add(6);
        vetorB.add(7);
        vetorB.add(8);
        vetorB.add(9);
        vetorB.add(10);
        for (Integer vetB : vetorB){
            System.out.println(vetB);
        }

        ArrayList<Integer> vetorC = new ArrayList<>(vetorA);
        vetorC.addAll(vetorB);
        for (Integer vetC : vetorC) {
            System.out.println(vetC);
        }

    }
}
