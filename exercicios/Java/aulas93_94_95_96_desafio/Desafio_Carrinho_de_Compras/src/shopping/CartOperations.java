package shopping;

public abstract class CartOperations {

    //valor total dos produtos no carrinho
    public abstract void getCartTotalPrice();

    //cria uma lista apenas com os preços dos produtos
    public void listCartPrices(){}

    //cria uma lista com a quantidade de itens 
    public void itemsCount(){}
    
}
