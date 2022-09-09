package lists;

import java.util.List;
import java.util.LinkedList;

public class LinkedList01 {
    
    public static void main(String[] args) {

        List<String> names = new LinkedList<String>();

        names.add("João");
        names.add("José");
        names.add("Cirilo");
        names.add("Maria");
        names.add("Caio");

        // imprimindo a LinkedList com todos os names adicionados
        System.out.println(names);

        // pegando um dos names adicionados pelo index
        System.out.println(names.get(0));

        // verificando se no LinkedList contém o item de nome "Jonas"
        System.out.println(names.contains("Jonas"));

        // atualizando o nome de item da posição de index 4, que agora passa a se chamar "Jonas"
        names.set(4, "Jonas");

        // imprimindo a LinkedList atualizada
        System.out.println(names);
    }
}
