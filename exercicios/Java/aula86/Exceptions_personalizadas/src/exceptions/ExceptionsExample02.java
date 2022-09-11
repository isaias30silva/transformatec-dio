package exceptions;

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException (String message) {
        super(message);
    }
}

public class ExceptionsExample02 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        Integer age = Integer.parseInt(scanner.nextLine());

        try {
            if (age < 18) {
                scanner.close();
                throw new AgeException("Idade deve ser superior ou igual a 18 anos.");
            } else {
                System.out.println("Pode dirigir! ");
            }
        } catch (AgeException ae) {
            //throw new NumberFormatException();
            System.out.println(ae.getMessage());
        }

        scanner.close();
    }
    
}
