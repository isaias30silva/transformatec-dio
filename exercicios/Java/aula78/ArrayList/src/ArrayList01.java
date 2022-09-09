import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>(2);

        System.out.println(names.size());

        //adicionando elementos
        names.add("Mariazinha");
        names.add("Pafuncio Silveira");

        //imprimindo o tamanho
        System.out.println(names.size());

        //hinter = hint - dica de parâmetro, nesse caso, a letra e
        names.add("Cassiano");

        System.out.println(names.get(0));

        System.out.println(names.size());

        if (names.contains("Cassiano")) {
            System.out.println("Contém");
        } else {
            System.out.println("Não contém");
        }

        //removendo elementos por index
        names.remove(0);

        //removendo elementos por objeto
        names.remove("Cassiano");

        System.out.println(names.size());
        System.out.println(names);

    }
}