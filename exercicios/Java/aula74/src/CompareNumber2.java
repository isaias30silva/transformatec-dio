import java.util.Arrays;

public class CompareNumber2 {
    
    public static void main(String[] args) {
        

        int numbers01[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int numbers02[] = {1, 2, 3, 4, 5, 6, 7, 8};

        /*comparando conteúdo de Arrays por meio do Operador Ternário */
        String message = Arrays.equals(numbers01, numbers02) ? "Iguais" : "Diferentes";

        System.out.println(message);
    }
}
