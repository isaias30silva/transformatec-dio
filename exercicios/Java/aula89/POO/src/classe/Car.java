package classe;

public class Car {

    protected String licensePlate;
    private String model;
    private String brand;
    private Integer year;
    private Integer height;

    public Car(String licensePlate, String model, String brand, Integer year, Integer height) {

        this.brand = brand;
        this.licensePlate = licensePlate;
        this.model = model;
        this.year = year;
        this.height = height;
    }

    //getters
    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public Integer getYear() {
        return this.year;
    }

    public Integer getHeight() {
        return this.height;
    }


    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}