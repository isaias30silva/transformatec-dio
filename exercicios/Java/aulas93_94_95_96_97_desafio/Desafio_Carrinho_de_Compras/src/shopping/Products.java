package shopping;

import java.util.ArrayList;
import java.util.List;

public class Products {
    
    //criando uma coleção de produtos - estoque de produtos disponíveis para venda
    List<Product> products = new ArrayList<Product>();

    //método construtor da classe Products
    public Products() {
        this.storeItems();
    }

    private void storeItems() {

        this.products.add(new Product(products.size(),"Perfume", "Boticário", "Cheiroso", 100.00, 10.00));
        this.products.add(new Product(products.size(),"Sabonete", "Boticário", "Cheiroso demais", 10.00, 10.00));
        this.products.add(new Product(products.size(),"Óleo Mineral", "Boticário", "Bem Cheiroso", 30.00, 10.00));
        this.products.add(new Product(products.size(),"Desodorante", "Boticário", "Cheiro Bom", 20.00, 10.00));
        this.products.add(new Product(products.size(),"Creme de Mão", "Boticário", "Barato", 30.00, 10.00));
        this.products.add(new Product(products.size(),"Batom", "Boticário", "Bonito", 50.00, 10.00));
    }

    public List<Product> getProducts() {
        return products;
    }

}
