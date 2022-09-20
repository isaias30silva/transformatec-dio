package shopping;

import java.util.Scanner;
import java.util.List;

public class UserScreen implements UserInterface {
    
    Cart cart = new Cart();
    private int opt = 0;

    //método construtor
    public UserScreen() {
        menu();
    }

    @Override
    public void startScreen() {
        System.out.println("1 - Menu de produtos");
        System.out.println("2 - Itens do carrinho");
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
        
        List<Product> product = new Products().getProducts();
        for(Product prod: product) {
            System.out.println("Id do produto " + prod.getId());
            System.out.println("Nome do produto " + prod.getName());
            System.out.println("Marca do produto " + prod.getBrand());
            System.out.println("Descrição do produto " + prod.getDescription());
            System.out.println("Preço do produto " + prod.getPrice());
        }
    }

    //método para adicionar um produto ao carrinho pelo ID
    public void addProductToCart() {
        int id = getUserInput();
        cart.addProduct(id);
    }

    //método para apresentar ao cliente carrinho com os produtos adicionados
    public void showCart() {

        System.out.println("Itens do carrinho");
        cart.printCart();
    }

    public void removeProductFromCart() {
        int id = getUserInput();
        System.out.println("Removendo produtos com o ID" + id);
        cart.removeFromCart(id);
    }

    //menu de produtos para adicionar ou remover do carrinho
    public void subMenu() {
        switch(opt) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
        }
    }
    
    @Override
    public void menu() {
        do{
            //menu inicial
            startScreen();
            //pega informação do teclado
            getUserInput();
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
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
            }
        } while(opt !=0);
    }

}
