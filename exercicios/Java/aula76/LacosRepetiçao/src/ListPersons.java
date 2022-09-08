public class ListPersons {
    
    public static void main(String[] args) {
        
        String persons[] = {"João", "Maria", "Pedro"};

        int i = 10;

        do {
            if(i > persons.length) {
                System.out.println("Índice inválido");
                break; //o break para finalizar a execução caso a condição seja satisfeita
            }

            System.out.println(persons[i]);
            i++; 

        } while (i < persons.length);
    }
}
