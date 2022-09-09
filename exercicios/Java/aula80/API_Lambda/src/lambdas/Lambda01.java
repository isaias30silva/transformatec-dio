package lambdas;

import java.util.List;
import java.util.ArrayList;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        names.add("Lucas");
        names.add("Marcelo");
        names.add("Gabriel");
        names.add("Daniel");
        names.add("Pedro");
        names.add("Elias");
        names.add("Jorge");
        names.add("Antônio");

        // sintaxe de uma função/expressão Lambda
        names.forEach(
            (name) -> System.out.println(name)
            );

            System.out.println();

            // vai verificar quais names possuem tamanho maior que 5 e vai imprimir estes names
            names.forEach(
                (name) -> {
                    if (name.length() > 5) {
                        System.out.println(name);
                    }
                }
            );
    }
}