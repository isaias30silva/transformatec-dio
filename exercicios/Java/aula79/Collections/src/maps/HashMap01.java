package maps;

import java.util.Map;
import java.util.HashMap;

public class HashMap01 {
    
    public static void main(String[] args) {

        // Key: Integer
        // Value: String

        Map<Integer, String> names = new HashMap<Integer, String>();

        names.put(0, "Josefina");
        names.put(5, "Maria");
        names.put(9, "Carlota");
        names.put(2, "Silvina");
        names.put(4, "Capitu");
        names.put(7, "Mariazinha");
        names.put(8, "Josefina");

        // imprimindo todas as keys por ordem crescente
        System.out.println(names.keySet());

        // imprimindo todos os valores por ordem crescente da key
        System.out.println(names.values());

        // imprimindo todos os names e suas respectivas keys pelo ordem crescente da key entre {}
        System.out.println(names);

        // imprimindo todos os names e suas respectivas keys por ondem crescente da key entre []
        System.out.println(names.entrySet());

        // substituindo o valor da key 8, que é "Josefina", por "Joaninha"
        names.replace(8, "Joaninha");

        names.remove(0);

        // vai remover o value da key 2 "Silvina"
        System.out.println(names.remove(2, "Silvina"));

        // não vai remover o value da key 9, pois na key 9 não há "Maria" e sim "Carlota"
        System.out.println(names.remove(9, "Maria"));

        System.out.println(names);

    }
}
