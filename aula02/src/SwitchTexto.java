import java.util.Scanner;

public class SwitchTexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String mes;
        switch ("mes") {
            case "jan":
                System.out.println("Mês 1"); break;
            case "fev":
                System.out.println("Mês 2"); break;
            case "mar":
                System.out.println("Mês 3"); break;
            case "abr":
                System.out.println("Mês 4"); break;
            case "mai":
                System.out.println("Mês 5"); break;
            case "jun":
                System.out.println("Mês 6"); break;
            case "jul":
                System.out.println("Mês 7"); break;
        }
    }
}
