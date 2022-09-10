import java.util.Scanner;

public class CallStackSum {

    public Integer sumNumbers(Integer n1, Integer n2) {

        System.out.println("Somando números!");

        Integer sum = n1 + n2;

        return sum;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        Integer number1 = 0;

        System.out.println("Informe o primeiro número: ");
        
        try {
            number1 = Integer.parseInt(scanner.nextLine());
        } catch(Exception e) {

            throw new Exception("O formato inserido não é válido");
        }

        System.out.println("Informe o segundo número: ");
        Integer number2 = Integer.parseInt(scanner.nextLine());
        
        scanner.close();

        CallStackSum callSum = new CallStackSum();

        Integer sumInteger = callSum.sumNumbers(number1, number2);

        System.out.println(sumInteger);

    }

}