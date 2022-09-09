package lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    public static void main(String[] args) {

        //Criando uma lista do tipo ArrayList de inteiros
        List<Integer> numbers = new ArrayList<Integer>(2);

        // adicionando elementos no ArrayList
        numbers.add(61);
        numbers.add(91);
        numbers.add(91);
        numbers.add(30);
        numbers.add(150);
        numbers.add(1);

        System.out.println(numbers);

        // .sort do Collections vai ordenar os itens por ordem crescente
        Collections.sort(numbers);
        System.out.println(numbers);

        // .reverse do Collections vai ordenar os itens por ordem decrescente
        Collections.reverse(numbers);
        System.out.println(numbers);
        
        // pegando um elemento do ArrayList pelo index
        System.out.println(numbers.get(2));

        // removendo um elemento do ArrayList pelo index
        numbers.remove(1);

        System.out.println(numbers);
    }
}