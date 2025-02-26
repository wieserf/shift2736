import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int placa; //1126
        System.out.println("Digite os dígitos da placa do veículo: ");
        placa = leitor.nextInt();
        int digito = placa % 10;

        switch (digito) {
            case 1:
            case 2:
                System.out.println("Rodízio segunda"); break;
            case 3:
            case 4:
                System.out.println("Rodízio terça"); break;
            case 5:
            case 6:
                System.out.println("Rodízio quarta"); break;
            case 7:
            case 8:
                System.out.println("Rodízio quinta"); break;
            default:
                System.out.println("Rodízio sexta"); break;
        }


    }
}
