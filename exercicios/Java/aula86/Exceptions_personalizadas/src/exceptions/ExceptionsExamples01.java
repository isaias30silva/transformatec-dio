package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

public class ExceptionsExamples01 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Leite");
        list.add("Pão");
        list.add("Manteiga");
        list.add("Queijo");

        System.out.println("Informe o item buscado: ");
        String item = scanner.nextLine();

        try {

            if (list.contains(item)) {
                //throw new NameNotFoundException();
                throw new ItemNotFoundException("Este item não está na lista!");
            } else {
                System.out.println("Item encontrado");
            }
        } catch (ItemNotFoundException ie) {
            System.out.println(ie.getMessage());
        } finally {
            scanner.close();
        }

    }
}