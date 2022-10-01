package com.api.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.example.models.Cart;
import com.api.example.models.Product;

import io.swagger.annotations.ApiOperation;

@RestController
//a notação @CrossOrigin define que pode acessar a API. O "*" indica que todos podem acessar
@CrossOrigin(origins = "*")
public class ProductServiceController {
    
    /**
     * Endpoints da API REST para manipular a class Product
     * 
     * 1- POST: criar um novo produto
     * 2- GET: buscar um produto
     * 3- GET: listar produtos
     * 4- PUT: atualizar um produto
     * 5- DELETE: remover um produto
     */

    private static List<Product> products = new ArrayList<Product>();

    private static Cart cart;

    static {

        products.add(new Product(0, "Shampoo Canino", 35.00, "Shampoo para cachorro gourmet"));
        products.add(new Product(1, "Shampoo Felino", 38.00, "Shampoo para gato gourmet"));
        products.add(new Product(2, "Bolinha de borracha", 15.00, "Brinquedo para cachorro"));
        products.add(new Product(3, "Remédio Canino", 30.00, "Remédio para cachorro nutella"));
        products.add(new Product(4, "Roupinha de cachorro", 105.00, "Roupinha de cachorro friorento"));
    }


    //método createProduct para criar um novo produto
    //a notação @ApiOperation inseri uma descrição no método, indicando a ação que ele faz
    @ApiOperation(value = "Adicionar um novo produto")
    @RequestMapping(value = "/products", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {

        products.add(product);
        return new ResponseEntity<>("Produto cadastrado com sucesso!", HttpStatus.OK);

    }

    //método getProduct para listar apenas um produto, pelo id
    //id-- para que pegue o Id e não o índice. Sem o id-- ele vai puxar o id 1 como 0, o id 2 com 1 e assim sucessivamente
    @ApiOperation(value = "Buscando um produto por Id")
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct(@PathVariable("id") int id) {

        return new ResponseEntity<>(products.get(id), HttpStatus.OK);

    }

    //método getProducts que vai listar todos os produtos. ResponseEntity retorna um objeto.
    //no return, serão apresentados os produtos(products) e o retorno do Http
    //anotação @RequestMapping indicando o caminho para acessar no navegador 
    @ApiOperation(value = "Listar todos os produtos")
    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getProducts() {

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    //método updateProduct para atualizar um produto da lista
    @ApiOperation(value = "Atualizar informações de um produto")
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
        products.remove(id);
        product.setId(id);
        products.add(product);

        return new ResponseEntity<>("Produto atualizado com sucesso!", HttpStatus.OK);
    }

    //método deleteProduct para remover um produto da lista
    @ApiOperation(value = "Excluir um produto")
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") int id){
        products.remove(id);
        return new ResponseEntity<>("Produto removido com sucesso!", HttpStatus.OK);
    }

    //método createCart para criar um carrinho de compras
    @ApiOperation(value = "Criar novo carrinho")
    @RequestMapping(value = "/cart", method = RequestMethod.POST, produces="application/json") 
    public ResponseEntity<Object> createCart(@RequestBody int id) {
        cart = new Cart(id);
        return new ResponseEntity<>("Carrinho criado com sucesso!", HttpStatus.OK);

    }
}
