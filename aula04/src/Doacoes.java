import java.util.Scanner;

public class Doacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdDoacoes = 0;
        double valorDoacao, valorTotalDoado = 0;
        System.out.println("Informe a quantidade de doações recebidas: ");
        qtdDoacoes = leitor.nextInt();
        //2. Para cada doação, solicitar ao usuário o valor doado.
        for (int i = 1; i <= qtdDoacoes; i++){
            System.out.println("Digite o valor doado na " + i + "doação: R$");
            valorDoacao = leitor.nextDouble();
            //3. Calcular e armazenar o valor total das doações recebidas.
            valorTotalDoado += valorDoacao;
        }

        //4. Verifricar se o valor total é superior a R$10.000,00
        if (valorTotalDoado > 10000)
            System.out.println("Parabéns! O valor das doações é significativo para a ONG.");
        else
            System.out.println("O valor das doações precisa ser aumentado");

        //5. Solicitar ao usuários o número de projetos que a ong realizou no mês.
        int qtdProjetos = 0;
        System.out.println("Informe o número de projetos realizados no mês: ");
        //int qtdProjetos = leitor.nextInt();

        //6. Verificar se o número de projetos é maior ou igual a 3.
        if (qtdProjetos >= 3)
            System.out.println("A ONG está realizando um ótimo trabalho!");
        else
            System.out.println("É importante realizar mais projetos.");

        //7. Calcular e armazenar a média de valor das doações recebidas por projeto.
        int i = 1;
        double valorDoadoPorProjeto, valorTotalDeProjeto = 0;
        while (i <= qtdProjetos){
            System.out.println("Valor doado no projeto " + i + ": ");
            valorDoadoPorProjeto = leitor.nextDouble();
            valorTotalDeProjeto += valorDoadoPorProjeto;
            i++;
        }

        double mediaDoacoesProjeto = valorTotalDeProjeto / qtdProjetos;

        //8. Exibir a media de valor das doações por projeto com duas casas decimais.
        System.out.printf("Média de doações por projeto foi de %.2f", mediaDoacoesProjeto);

        //9. Exibir a quantidade de doações recebidas.
        System.out.println("Qauntidade de doações recebidas: " + qtdDoacoes);

        //10. Exibir o valor total das doações recebidas.
        System.out.println("Valor total de doações R$ " + valorTotalDoado);









    }
}
