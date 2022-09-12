package classes;

public class HandlePerson {

    static Person person = new Person("Isaias", 30, "Estudante");
    
    public static void main(String[] args) throws Exception {
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getProfession());

        person.setProfession("Teacher");

        System.out.println(person.getProfession());
    }
}
