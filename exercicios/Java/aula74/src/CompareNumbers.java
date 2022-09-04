import java.util.Arrays;

public class CompareNumbers {

    public static void main(String[] args) {
        

        int numbers01[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int numbers02[] = {1, 2, 3, 4, 5, 6, 7, 8};

        /*comparando se o conteúdo dos arrays é igual*/
        if (Arrays.equals(numbers01, numbers02)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }

}
