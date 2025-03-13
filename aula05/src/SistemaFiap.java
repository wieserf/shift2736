import java.util.Scanner;

public class SistemaFiap {

    //variavel global
    public static String email, senha, apelido;

    //declarando uma constante de memória -> constante não muda na execução do programa, apenas no código
    static final int MAX = 50;

    public static String[] equipamentoSerie = new String[MAX];

    public static String[] equipamentoDescricao = new String[MAX];

    public static String[] equipamentoStatus = new String[MAX]; //Em manutenção, finalizado, entrada

    public static int qtdEquipamento = 0;


    //Metodo que devolva a quantidade de equipamentos que estão em manutenção
    public static int contarEquipamentoEmManutencao(){
        int total = 0;
        for (int i = 0; i < qtdEquipamento; i++){
            if (equipamentoStatus[i].equalsIgnoreCase("Em manutenção"))
                total++;
        }
        return total;
    }

    //Metodo que altera o status
    public static void alterarStatusEquipamento(String numeroSerie, Scanner leitorNumerico){
        boolean encontrado = false;
        for (int i = 0; i < qtdEquipamento; i++){
            if (equipamentoSerie[i].equalsIgnoreCase(numeroSerie)){
                System.out.println("Deseja alterar o status atual para: " + "1 - Em manutenção\t2 - Finalizado");
                int op = leitorNumerico.nextInt();
                if (op == 1)
                    equipamentoStatus[i] = "Em manutenção";
                else
                    equipamentoStatus[i] = "Finalizado";
                encontrado = true;
            }

        }
        if (!encontrado)
            System.out.println("Nenhum equipamento com este número de sério está cadastrado");

    }


    //Metodo que exiba todos os equipamentos em manutenção
    public static void exibirEquipamentosEmManutenção(){
        for (int i = 0; i < qtdEquipamento; i++){
            System.out.println("Relatório de equipamentos em manutenção" + "\n======================================");
            //for (int i = 0; i< qtdEquipamento; i++){
                if (equipamentoStatus[i].equalsIgnoreCase("Em manutenção")){
                    System.out.println(equipamentoDescricao[i] + "numero de serie");
                //}
            }

        }

    }



    public static void cadastrarEquipamento(Scanner leitor) {
        if (qtdEquipamento >= MAX){
            System.out.println("Limite de equipamentos atingido");
            return;
        }
        System.out.println("Número de série: ");
        equipamentoSerie[qtdEquipamento] = leitor.nextLine();
        System.out.println("Descrição: ");
        equipamentoDescricao[qtdEquipamento] = leitor.nextLine();
        System.out.println("Status: ");
        equipamentoStatus[qtdEquipamento] = leitor.nextLine();
        qtdEquipamento++;
        System.out.println("Equipamento cadastrado com sucesso!");

    }


    public static void exibirMenuPrincipal(){
        System.out.println("FIAP System");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Efetuar login");
        System.out.println("1 - Sair");
        System.out.println("Digite a opção desejada: ");
    }

    //cadastrar usuário
    public static String cadastroUsuario(Scanner leitor){
        String nome, telefone;
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = leitor.nextLine();
        System.out.println("Digite seu e-mail: ");
        email = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leitor.nextLine();
        System.out.println("Digite seu apelido: ");
        apelido = leitor.nextLine();
        return nome + " seu cadastro foi realizado com sucesso!";
    }

    //validarLogin
    public static boolean validarLogin(String emailDigitado, String senhaDigitada){
        if (emailDigitado.equalsIgnoreCase(email) && senhaDigitada.equals(senha))
            return true;
            return false;
    }

    public static void subMenu() {
        System.out.println("Digite 1 para registrar um produto");
        System.out.println("Digite 2 para mostrar equipamentos em manutenção");
        System.out.println("Digite 3 para exibir quantidade de quepiamentos em manutenção");
        System.out.println("Digite 4 ");
        System.out.println("Digite 0 para voltar para o menu principal");
        System.out.println("Opção desejada .: ");
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        int opcao = 0, opcaoSubMenu = 0;
        String emailDigitado, senhaDigitada;

        do {
            exibirMenuPrincipal();
            opcao = leitorNumerico.nextInt();
            switch (opcao){
                case 1 -> {
                    System.out.println(cadastroUsuario(leitor));
                }
                case 2 -> {
                    System.out.println("Login");
                    System.out.println("Digite seu e-mail: ");
                    emailDigitado = leitor.nextLine();
                    System.out.println("Digite sua senha: ");
                    senhaDigitada = leitor.nextLine();
                    if (validarLogin(emailDigitado, senhaDigitada)){
                        System.out.println("Usuário logado com sucesso! Bem vindo(a) " + apelido);
                        do {
                            subMenu();
                            opcaoSubMenu = leitorNumerico.nextInt();
                            switch (opcaoSubMenu){
                                case 1 -> cadastrarEquipamento(leitor);
                                case 2 -> exibirEquipamentosEmManutenção();
                                case 3 -> System.out.println("Quantidade de equipamentos em manutenção é " + contarEquipamentoEmManutencao());
                                case 4 -> {
                                    System.out.println("Informe o número de série do quipamento: ");
                                    alterarStatusEquipamento(leitor.nextLine(), leitorNumerico);
                                }
                                case 0 -> System.out.println("Retornando ao menu principal ......");
                            }
                        }while (opcaoSubMenu != 0);

                    }else {
                        System.out.println("Usuário e/ou senha inválidos!");
                    }
                }//login
                case 3 -> System.out.println("Obrigada por utilizar nosso sistema!");
            }
        }while (opcao != 3);

    }

}