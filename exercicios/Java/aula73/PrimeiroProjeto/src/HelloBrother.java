import java.util.Scanner;

public class HelloBrother {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + name + " e sua idade é " + idade + " anos.");

        scanner.close();
    }
}
