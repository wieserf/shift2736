import java.util.Scanner;

public class SwitchInteiros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int mes = 3;
        switch (mes) {
            case 1:
                System.out.println("Janeiro"); break;
            case 2:
                System.out.println("Fevereiro"); break;
            case 3:
                System.out.println("Março"); break;
            case 4:
                System.out.println("Abril"); break;
            case 5:
                System.out.println("Maio"); break;
            case 6:
                System.out.println("Junho"); break;
            default:
                System.out.println("Segundo semestre"); break;
        }
    }
}
