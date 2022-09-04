import java.util.Arrays;

public class GetName2 {
    
    public static void main(String[] args) {

        String names[] = {"José", "João", "Pedro", "Paulo", "Maria", "Júlia", "Mariana"};

        String name = "Maria";

        /*outra forma de verificar se um nome está em uma Array de nome, mais simplificado, sem usar o for*/
        if(Arrays.asList(names).contains(name)) {
            System.out.println("Seja bem vindo à festa!");
        } else {
            System.out.println("Já falei para vazar, penetra!");
        }
    }
}
