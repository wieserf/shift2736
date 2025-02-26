import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char sinal = 'x';
        switch (sinal) {
            case '+':
                System.out.println("Adição"); break;
            case '-':
                System.out.println("Subtração"); break;
            case '*':
                System.out.println("Multiplicação"); break;
            case '/':
                System.out.println("Divisão"); break;
        }
    }
}
