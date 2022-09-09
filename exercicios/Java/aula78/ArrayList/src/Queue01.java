import java.util.PriorityQueue;

public class Queue01 {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> names = new PriorityQueue<String>();

        names.add("José");
        names.add("Tereza");
        names.add("Pedro");

        System.out.println(names);

        //pega o primeiro item da fila
        System.out.println(names.peek());

        System.out.println(names);

        //remove o primeiro item da fila
        System.out.println(names.poll());

        System.out.println(names);
    }
}
