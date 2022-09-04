class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

        //define valor
        public void setName(String name) {
            this.name = name;
        }

        //consulta valor
        public void setAge(int age) {
            this.age = age;
        }

        //método da classe
        public void display() {
            System.out.println("Nome: "+this.name);
            System.out.println("Idade: "+this.age);
        }
}


public class PersonsArray {
    
    public static void main(String[] args) {
        
        Person persons[] = new Person[3];

        persons[0] = new Person("Cassiano",32);
        persons[1] = new Person("Joao", 22);
        persons[2] = new Person("Ricardo", 42);

        for (int i = 0; i < persons.length; i++) {
            persons[i].display();
            System.out.println();
        }

    }
}
