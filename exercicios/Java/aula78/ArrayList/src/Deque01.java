import java.util.Deque;
import java.util.ArrayDeque;

public class Deque01 {
    
    public static void main(String[] args) {
        

        Deque<String> deque = new ArrayDeque<String>(5);

        deque.add("Ronaldinho Gaúcho");
        deque.add("Romário");
        deque.add("Neymar");
        deque.add("Lúcio");
        deque.add("Marcos");

        for (String pic: deque) {
            System.out.println(pic);
        }

        //pega o último elemento
        System.out.println(deque.getLast());

        System.out.println(deque);

        //adiciona ao início da lista
        deque.addFirst("Coutinho");

        System.out.println(deque);

        deque.addLast("Romarinho");

        //adiciona ao final da lista
        System.out.println(deque);
    }
}
