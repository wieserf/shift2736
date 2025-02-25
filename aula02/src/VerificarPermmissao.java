import java.util.Scanner;

public class VerificarPermmissao {
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);

        String perfilUsuario;
        System.out.println("Digite o perfil do seu usuário: ");
        perfilUsuario = leitor.nextLine();

        if (perfilUsuario == "administrador"){
            System.out.println("Antenção, usuário sem privilégios administrativos \nAlgumas funcionalidades estão bloqueadas");
        }

        String nome = "Fernando";
        if (nome.equals("Fernando"))
            System.out.println("Bem vindo " + nome);
    }
}
