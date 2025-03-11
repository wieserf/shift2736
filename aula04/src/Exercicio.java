import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
        //1. Preencher um vetor com 6 números
        //2. Exibir o maior elemento do vetor
        //3. Somar o vetor e exibir a média
        //4. Exibir o indice do primeiro número negativo
        //5. Exibir quantos números são pares

        int[] numeros = new int[6];
        int i, soma = 0, maior, qtdPares = 0;

        //1. Preencher um vetor com 6 números
            for (i = 0; i < numeros.length; i++) {
                System.out.println("Digite o " + (i+1) + "° número");
                numeros[i] = leitorNumerico.nextInt();
            }

        //2. Exibir o maior elemento do vetor
        maior = numeros[0];
            for (i=0; i < numeros.length; i++){
                if (numeros[i] > maior){
                    maior = numeros[i];
                }
            }
        System.out.println("O maior número é " + maior);

        //3. Somar o vetor e exibir a média
        for (i=0; i < numeros.length; i++){
            soma =+ numeros[i];
        }
        int media = soma / numeros.length;
        System.out.println("Média = " + media);

        //4. Exibir o indice do primeiro número negativo
        for (i=0; i < numeros.length; i++){
            if (numeros[i] < 0){
                break;
            }
        }
        System.out.println("Indice do primeiro negativo é " + i);

        //5. Exibir quantos números são pares
        for (i=0; i < numeros.length; i++){
            if (numeros[i]%2 == 0){
                qtdPares++;
            }
        }
        System.out.println("Quantidade de pares " + qtdPares);


    }
}
