package shopping;

import java.util.Scanner;
import java.util.List;

public class UserScreen implements UserInterface {
    
    Cart cart = new Cart();

    List<Product> products = new Products().getProducts();
    
    private int opt = 0;

    //método construtor
    public UserScreen() {
        menu();
    }

    @Override
    public void startScreen() {
        System.out.println("1 - Menu de produtos");
        System.out.println("2 - Itens do carrinho");
        System.out.println("3 - Quantidade de itens no carrinho");
        System.out.println("4 - Listar preços do carrinho");
        System.out.println("5 - Preço total do carrinho");
        System.out.println("0 - Sair");
    }

    @Override
    public int getUserInput() {
        System.out.println("Sua opção");
        Scanner scanner = new Scanner(System.in);
        opt = Integer.parseInt(scanner.next());
        return opt;
    }

    public void productMenu() {

        System.out.println("1 - Adicionar produto ao carrinho");
        System.out.println("2 - Remover produto do carrinho");
        System.out.println("0 - Sair");

    }

    public void displayProducts() {
        
        for(Product prod: products) {
            System.out.println("Id do produto " + prod.getId());
            System.out.println("Nome do produto " + prod.getName());
            System.out.println("Marca do produto " + prod.getBrand());
            System.out.println("Descrição do produto " + prod.getDescription());
            System.out.println("Preço do produto " + prod.getPrice());

            System.out.println();
        }
    }

    //método para adicionar um produto ao carrinho pelo ID
    public void addProductToCart() {
        int id = getUserInput();
        
        try {
            if(id >= products.size()) {
                throw new ProductNotFoundException("Produto não encontrado");
            } else {
                cart.addProduct(id);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //método para apresentar ao cliente carrinho com os produtos adicionados
    public void showCart() {

        System.out.println("Itens do carrinho");
        cart.printCart();
    }

    //método para apresentar ao cliente a quantidade de itens do carrinho
    private void showCartQuantity() {
        System.out.println("Total de itens no carrinho");
        cart.itemsCount();
    }

    //método para apresentar ao cliente o preço total dos itens do carrinho
    private void showCartTotalPrice() {
        System.out.println("Valor total do carrinho");
        cart.getCartTotalPrice();
    }

    //Método para apresentar ao clientes os preços de cada item do carrinho
    private void showCartPrices() {
        System.out.println("Lista de preços do carrinho");
        cart.listCartPrices();
    }

    //Método que permite a exclusão de um item do carrinho
    public void removeProductFromCart() {
        int id = getUserInput();
        cart.removeProduct(id);
        System.out.println("Removendo produtos com o ID" + id);
    }

    //menu de produtos para adicionar ou remover do carrinho
    public void subMenu() {
        try {
            switch(opt) {
                case 1:
                    addProductToCart();
                    showCart();
                    break;
                case 2:
                    removeProductFromCart();
                    break;
                default:
                    throw new OptionException("Opção inválida");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void menu() {
        do{
            //menu inicial
            startScreen();
            //pega informação do teclado
            getUserInput();
            try {
                switch(opt) {
                    case 1:
                        displayProducts();
                        productMenu();
                        getUserInput();
                        subMenu();
                        break;
                    case 2:
                    //mostra a lista de produtos no carrinho
                        showCart();
                        break;
                    case 3:
                    //mostra a quantidade de produtos no carrinho
                        showCartQuantity();
                        break;
                    case 4:
                    //mostra os preços dos produtos no carrinho
                        showCartPrices();
                        break;
                    case 5:
                    //mostra o total de compras do carrinho
                        showCartTotalPrice();
                        break;
                    case 0:
                        System.out.println("Bye!");
                        System.exit(0);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(opt !=0);
    }

}
