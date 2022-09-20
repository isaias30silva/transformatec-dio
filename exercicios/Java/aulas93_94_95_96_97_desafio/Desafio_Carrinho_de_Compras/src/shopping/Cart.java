package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart extends CartOperations {
    
    List<Product> cartItems = new ArrayList<Product>();

    //métodos que serão habilitados para o carrinho de compras:
    //1 adicionar produtos
    //2 remover produtos
    //3 obter produtos pelo ID
    //4 listar produtos

    //chama o método para buscar um produto em estoque e adicioná-lo ao carrinho
    public void addProduct(Integer id) {
        Product product = getProductById(id);
        addToCart(product);
    }

    //--------------------------------Métodos lambda-------------------

    @Override
    public void getCartTotalPrice(){
        //definindo o fluxo
        Double totalPrice = cartItems.stream()
        .map(cartItem -> cartItem.getPrice())
        .reduce(0.0, (subTotal, cartItem) -> subTotal + cartItem);

        System.out.println(totalPrice);
    }

    @Override
    public void listCartPrices(){
        List<Double> cartPrices = cartItems.stream()
        .map(cartItem -> cartItem.getPrice()).toList();

        cartPrices.stream().forEach(cartPrice -> System.out.println(cartPrice));

    }

    @Override
    public void itemsCount(){
        Long itemsQt = cartItems.stream().count();
        System.out.println(itemsQt);
        
    }

    //---------------------------------FIM métodos lambda--------------


    //criando método para adicionar um produto à lista de itens do carrinho
    private void addToCart(Product product) {

    //adicionando itens à coleção
        cartItems.add(product);
    }

    //criando método para remover um produto do carrinho
    public void removeProduct(Integer id) {

        Product product = getProductById(id);
        cartItems.remove(product);

    }

    //cria o método de buscar um produto cadastrado no estoque
    private Product getProductById(Integer id) {

        //objeto que receberá o produto pesquisado no estoque
        Product product = null;

        //Lista de produtos em estoque
        List<Product> products = new Products().getProducts();

        for (Product prod : products) {
            if (prod.getId() == id) {

                //elemento encontrado
                product = prod;

            }

        }

        return product;
    }

    //método para imprimir a lista de produtos do carrinho
    public void printCart() {
        for (Product product : cartItems) {
            System.out.println("Nome do produto: " + product.getName());
            System.out.println("Marca do produto: " + product.getBrand());
            System.out.println("Descricao do produto: " + product.getDescription());
            System.out.println("Preco do produto: " + product.getPrice());
            System.out.println();
        }
    }
}
