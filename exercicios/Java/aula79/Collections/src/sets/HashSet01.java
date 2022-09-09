package sets;

import java.util.LinkedHashSet;

public class HashSet01 {

    public static void main (String[] args) {

        LinkedHashSet<Integer> numbers01 = new LinkedHashSet<Integer>();

        numbers01.add(1);
        numbers01.add(2);
        numbers01.add(3);
        numbers01.add(4);

        System.out.println("Numbers01: "+ numbers01);

        LinkedHashSet<Integer> numbers02 = new LinkedHashSet<Integer>();

        //numbers02.add(4);
        //numbers02.add(8);
        numbers02.add(6);
        numbers02.add(9);

        System.out.println("Numbers02: "+ numbers02);

        // verifica se os numbers02 estão contidos em numbers01 e retorna true ou false
        System.out.println(numbers01.containsAll(numbers02));

        numbers02.add(8);

        // mesclando os itens contidos em numbers01 para numbers02. não vai pegar o 4 do numbers01 pois já existe 4 no numbers02
        numbers02.addAll(numbers01);

        System.out.println(numbers02);
    }
    
}
