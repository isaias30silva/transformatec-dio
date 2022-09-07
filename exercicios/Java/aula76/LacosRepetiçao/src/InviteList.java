public class InviteList {
    
    public static void main(String[] args) {
        

        String[] persons = {"John", "Jonny", "Maria", "Natan", "Renato", "Eduardo"};

        //for
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        
        System.out.println("");

        //for each (mesmo resultado do for, porém mais simplificado)
        for (String person : persons) {
            System.out.println(person);
        }
    }
}
