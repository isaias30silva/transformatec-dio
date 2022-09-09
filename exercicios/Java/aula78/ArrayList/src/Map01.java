import java.util.Map;
import java.util.HashMap;

public class Map01 {

    public static void main(String[] args) {
        

        HashMap<Integer, String> contacts = new HashMap<Integer, String>(3);

        contacts.put(0, "Cassiano");
        contacts.put(1, "José");
        contacts.put(2, "Cassiano");

        System.out.println(contacts);

        //pega um item pelo valor da key
        System.out.println(contacts.get(2));

        for (Map.Entry<Integer, String> contact : contacts.entrySet()) {
            System.out.println(contact.getKey() + ":" + contact.getValue());
        }
    }
    
}
