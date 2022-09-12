package classes;

public class PersonInside {
    
    //atributos
    private String name;
    private Integer age;
    String profession;

    public PersonInside (String name, Integer age, String profession) {

        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static void main(String[] args) {
        
        PersonInside personInside = new PersonInside("Isaias", 30, "Estudante");

        System.out.println(personInside.name);
        System.out.println(personInside.getAge());
    }
}
