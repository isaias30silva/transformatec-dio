package streams;

import java.util.Arrays;
import java.util.List;

public class Reducer {
    
    public static void main(String[] args) {
        
        //Lista criada a partir de um array de números
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int result = 0;

        //somando os itens da lista, sempre o resultado anterior com o próximo número
        for (Integer number : numbers) {
            result = result + number;
        }

        System.out.println("Soma sem stream: " + result);

        //sum -> resultado de uma soma parcial
        Integer resultStream = numbers.stream().reduce(0, (sum, number) -> sum + number);

        //forma de somar itens de uma lista com stream, uma forma reduzida de código
        System.out.println("Soma com Stream: "+ resultStream);
    }
}
