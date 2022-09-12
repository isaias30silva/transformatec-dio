package exceptions;

import java.util.ArrayList;

public class ArrayException {
    
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Sapato");
        list.add("Meia");
        list.add("Tênis");
        list.add("Bermuda");
        list.add("Camisa");
        list.add("Blusa");

        int position = 5;
        getItem(list, position);
    }

    private static void getItem(ArrayList<String> list, int position) {

        if(list.size() <= position) {
            throw new IndexOutOfBoundsException("Item não encontrado");
        }

        System.out.println("Elemento recuperado");
        String item = list.get(position);
        System.out.println(item);
    }
}
