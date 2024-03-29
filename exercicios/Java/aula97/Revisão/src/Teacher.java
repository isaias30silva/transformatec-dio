public class Teacher extends Person implements SchoolInterface {
    
    private int code;
    private String area;

    public Teacher(int id, String name, int age, int code, String area){
        super(id, name, age);
        this.code = code;
        this.area = area;
    }

    //setters
    public void setCode(int code){
        this.code = code;
    }

    public void setArea(String area){
        this.area = area;
    }

    //getters
    public int getCode(){
        return code;
    }

    public String getArea(){
        return area;
    }

    @Override
    public void checkIn(String name){
        System.out.println("O professor " + name + "bateu o cartão de entrada");
    }

    @Override
    public void checkOut(String name){
        System.out.println("O professor " + name + "bateu o cartão de saída");
    }
}
