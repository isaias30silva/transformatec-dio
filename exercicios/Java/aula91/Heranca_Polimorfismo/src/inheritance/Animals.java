package inheritance;

class Animal{

    //modificador de acesso para private
    private String food;
    //método construtor
    public Animal(String food) {
        this.food = food;
    }

    //método eat
    public void eat() {
        System.out.println("Come " + this.food);
    }
}

    class Cat extends Animal {

        //atributo da subclass Cat
        private String name;

        public Cat(String food, String name) {
            //chamando o construtor da super-classe (animal)
            super(food);
            this.name = name;
        }

        //métodos da subclasse
        public String getName() {
            //System.out.println(this.name);
            return this.name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

    }

    class Dog extends Animal {

        //atributos de subclasse
        private String name;
        private String pedigree;

        public Dog(String food, String nameString, String pedigreeString) {
            //Invoca o construtor da superclasse
            super(food);
            //atributos da subclasse
            this.name = nameString;
            this.pedigree = pedigreeString;
        }

        //métodos da subclasse
        public String getName() {
            //System.out.println(this.name);
            return this.name;
        }
        public void setName(String newName) {
            this.name = newName;
        }

        //métodos da subclasse
        public String getPedigree() {
            return this.pedigree;
        }

        public void setPedigree(String pedigreeString) {
            this.name = pedigreeString;
        }
    }

    public class Animals {
        public static void main(String[] args) throws Exception {
            System.out.println("Hello, World!");

            Cat cat = new Cat("sardinha", "Mimo");
            System.out.println("O nome do gato é: " + cat.getName());
            cat.eat();

            Dog dog = new Dog("Ração", "Pudim", "Golden");
            System.out.println("O cachorro " + dog.getName() + " da raça " + dog.getPedigree());
            dog.eat();
    }
}