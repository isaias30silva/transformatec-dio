public class Student extends Person implements SchoolInterface {

    private int classNumber;
    private int year;

    public Student(int id, String name, int age, int classNumber, int year){
        super(id, name, age);
        this.classNumber = classNumber;
        this.year = year;
    }

    public void setClassNumber(int classNumber){
        this.classNumber = classNumber;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getClassNumber(){
        return this.classNumber;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public void checkIn(String name){
        System.out.println("O aluno " + name + "assinou a lista de entrada");
    }

    @Override
    public void checkOut(String name){
        System.out.println("O aluno " + name + "assinou a lista de saída");
    }
    
}
