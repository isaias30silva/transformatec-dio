package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product {

    int id;
    String name;
    double price;

    //criando objeto Product
    public Product(int id, String name, double price) {

        super();
        this.id = id;
        this.price = price;
        this.name = name;
    }
}

public class Stream02 {

    public static void main(String[] args) {
        
        //criando uma lista de carrinho de compras
        List<Product> cart = new ArrayList<Product>();

        //adicionando itens à lista de carrinho de compras
        cart.add(new Product(1, "Carregador", 200));
        cart.add(new Product(2, "Teclado", 700));
        cart.add(new Product(3, "Fone", 800));
        cart.add(new Product(4, "Mouse", 300));

        //utilizando um filtro na lista de carrinho de compras para encontrar os produtos que custam mais de 300 reais
        Stream<Product> stream = cart.stream().filter(product -> product.price > 300);

        //utilizando um filtro e uma contagem de quantos produtos custam mais do que 300 reais
        double stream2 = cart.stream().filter(product -> product.price > 300).count();

        // imprimindo o resultado da quantidade de produtos
        System.out.println("Quantidade de produtos: " + stream2);

        // imprimindo o resultado dos itens e seus preços
        stream.forEach(
            product -> System.out.println(product.id + "-" + product.name + ":" + product.price)
        );

    }
    
}
