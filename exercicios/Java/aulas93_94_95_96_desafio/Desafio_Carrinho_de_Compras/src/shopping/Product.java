package shopping;

public class Product {

    //atributos da classe
    private Integer id;
    private String name;
    private String brand;
    private String description;
    private Double price;
    private Double stock;

    //criando o método construtor da classe
    public Product(Integer id, String name, String brand, String description, Double price, Double stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this. description = description;
        this.price = price;
        this.stock = stock;
    }

    //criando métodos getters e setters da classe

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public void updateStock(Double s) {
        this.stock += s;
    }

}