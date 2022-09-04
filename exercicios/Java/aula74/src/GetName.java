public class GetName {
    
    public static void main(String[] args) {
        

        String names[] = {"José", "João", "Pedro", "Paulo", "Maria", "Júlia", "Mariana"};

        String name = "Maria";

        boolean found = false;

        /*verificando se um nome consta em um Array de nomes */
        for (int i = 0; i < names.length; i++) {
            if(names[i] == name) {
                found = true;
            }
        }

        if(found) {
            System.out.println("Seja bem vindo, "+name);
        } else {
            System.out.println("Vaza penetra!");
        }
    }
}
