package products;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ShopCart {
    
    public static void main(String[] args) {
        
        List<Products> cart = new ArrayList<Products>();

        cart.add(new Products(1, "iPhone", 5000.00));
        cart.add(new Products(2, "Monitor", 500.00));
        cart.add(new Products(3, "Mouse", 50.00));
        cart.add(new Products(4, "CPU", 550.00));
        cart.add(new Products(5, "Teclado", 55.00));
        cart.add(new Products(6, "HeadSet", 5.00));
        cart.add(new Products(7, "Microfone", 25.00));
        cart.add(new Products(8, "Modem", 52.00));

        //fazendo uma lista a partir de uma filtragem que vai verificar todos os products que custam 5000.00 ou menos
        List<Double> priceList = cart.stream()
        .filter(products -> products.getPrice() <= 5000.00)
        .map(products -> products.getPrice()).toList();

        //imprimindo a lista feita a partir do stream (preço)
        priceList.forEach((price) -> System.out.println("Price: " + price));

        System.out.println();

        //fazendo uma lista a partir de uma filtragem que vai verificar todos os products que custam 5000.00 ou menos
        List<Products> productList = cart.stream()
        .filter(products -> products.getPrice() <= 5000.00)
        .map(products -> products).toList();

        //imprimindo a lista feita a partir do stream (nomes e preços)
        productList
        .forEach((products) -> System.out.println("Product: " + products.getId() + " " + products.getName() + " " + products.getPrice()));

        System.out.println();

        //Convertendo uma List em um Map (chave/valor)
        Map<Integer, String> productsMap = cart.stream()
        .filter(products -> products.getPrice() < 5000.00)
        .collect(Collectors.toMap(products -> products.getId(), products -> products.getName()));

        System.out.println(productsMap);

    }
}
