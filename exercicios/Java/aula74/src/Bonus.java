import java.util.Scanner;

public class Bonus {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário do colaborador: ");
        double salary = scanner.nextFloat();

        double upgradedSalary = salary >= 15000 ? salary * 1.10 : salary * 1.05;

        System.out.println("Seu novo salário é: " + upgradedSalary);

        scanner.close();
    }
}
