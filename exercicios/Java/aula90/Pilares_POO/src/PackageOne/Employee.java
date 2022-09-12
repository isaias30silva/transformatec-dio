package PackageOne;

public class Employee {

    private Integer ID; //visível apenas para a própria classe
    protected String name; //visível apenas para subclasses em qualquer pacote
    public String position; //visível para qualquer classe mesmo em outros pacotes
    String department; // default: visível apenas para as subclasses dentro do mesmo pacote

    public Employee(Integer ID, String name, String position, String department) {
        this.ID = ID;
        this.name = name;
        this.position = position;
        this.department = department;
    }

    //getters
    public Integer getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public String position() {
        return this.position;
    }

    public String department() {
        return this.department;
    }


    //setters

}