import java.util.Scanner;

public class ComandosIniciais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // ]Comentário de linha
        // Comandos de entrada, saída e processamento
        //Comando de saída (sistema mandando algum comando para usuário) -> System.out.print (sout - abreviação)
        System.out.println("Bem vindos ao Shift Java");
        System.out.print("Digite seu nome: ");

        //Variável de memória -> É um espaço na memória RAM para armezenar uma informação
        //tipo nomeDaVariavel;

        // int idade; //Variavel do tipo inteiro (números inteiros)
        // double salario; //Variavel real (números com casas decimais)
        // boolean temFilhos; //true ou false (valores lógicos)
        // string nome; //Objeto que armazena uma sequencia de carateres ("exemplo")
        String nome;
        int idade;

        //Entrada de dados (Usuário mandando alguma informação para o sistema) - variavel = leitor.nextTipo;
        nome = leitor.next();
        System.out.println("Olá " + nome + "!");
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println("Você tem " + idade + " anos");

        //Processamento
        //Atribuição -> (guardar em uma varial) variavel = alguma coisa (valor | variavel | cálculo)

        int x = 10; //x recebe o valor 10 -> estou atribuindo 10 à variável x
        int y = 10 * 2; //Processamento -> processa um calculo e atribui a variavel y
        y = 2 * x;

        /*
        Operadores aritiméticos:
        + soma
        - subtração
        * multiplicação
        / divisão
        % resto da divisão
         */


        /*
        Comentário
        de várias
        linhas
        * */
    }
}
