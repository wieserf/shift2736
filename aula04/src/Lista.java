import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Fernando");
        nomes.add("Samira");
        nomes.add(1, "Barto");
        nomes.add("Delta");
        System.out.println(nomes);

        //inicialização; condição; incremento.
        //for (int i = 0; i < nomes.size(); i++)

        //para cada nome do tipo string da colação nomes faça alguma coisa
        for (String nome : nomes){
            System.out.println(nome);
        }

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(44);
        numeros.add(15);
        for (Integer num : numeros){
            System.out.println(num);

        }

    }
}
