import java.util.Scanner;

public class AgesArray {
    public static void main(String[] args) {

        //array de idades de cinco posições
        int[] ages = new int[5]; 

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < ages.length; i++) {
            System.out.println("Informe a idade do aluno" + i + ":");
            ages[i] = scanner.nextInt();
        }

        for (int age : ages) {
            System.out.println("Idade: " + age);
        }

        scanner.close();
    }
}
