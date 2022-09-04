import java.util.Scanner;

public class NamesArray {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];

        for (int i = 0; i < names.length; i++) {

            System.out.println("Informe o nome da pessoa [" + i +"]:");

            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nome da pessoa [" + i + "]:" + names[i]);
        }

    }
}
