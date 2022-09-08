import java.util.Scanner;

class Person {

    //atributos que definem os objetos dessa classe informados no construtor e alterados nos setters
    String name;
    String phone;
    String email;

    //método construtor para criar um novo objeto com informações inseridas
    public Person(String name, String phone, String email) {

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //métodos setters para alterar dados
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayPerson() {
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + phone);
    }
}


public class ContactList {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Array de pessoas
        Person persons[] = new Person[2];

        //laço de repetição para preencher o array de pessoas
        for(int i = 0; i < persons.length; i++) {

            System.out.println("Nome da pessoa " + i + ":");
            String name = scanner.nextLine();

            System.out.println("Telefone da pessoa " + i + ":");
            String phone = scanner.nextLine();

            System.out.println("Email da pessoa " + i + ":");
            String email = scanner.nextLine();

            persons[i] = new Person(name, phone, email);

            System.out.println();
        }

        System.out.println();
        System.out.println("Lista de contatos");

        for (Person person : persons) {

            person.displayPerson();
            System.out.println();
        }

        //Variável que recebe um objeto da classe Person

        Person p = persons[1];

        //Chamando métodos do objeto para alterar o valor do telefone
        p.setPhone("4500009998899");

        System.out.println();
        System.out.println("Pessoa alterada");
        System.out.println();

        p.displayPerson();
    
        scanner.close();
    
}

}
