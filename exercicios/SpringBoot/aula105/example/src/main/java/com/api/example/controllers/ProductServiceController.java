package com.api.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.example.models.Product;

@RestController
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

    static {

        products.add(new Product(1, "Shampoo Canino", 35.00, "Shampoo para cachorro gourmet"));
        products.add(new Product(2, "Shampoo Felino", 38.00, "Shampoo para gato gourmet"));
        products.add(new Product(3, "Bolinha de borracha", 15.00, "Brinquedo para cachorro"));
        products.add(new Product(4, "Remédio Canino", 30.00, "Remédio para cachorro nutella"));
        products.add(new Product(5, "Roupinha de cachorro", 105.00, "Roupinha de cachorro friorento"));
    }


    //método createProduct para criar um novo produto
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {

        products.add(product);
        return new ResponseEntity<>("Produto cadastrado com sucesso!", HttpStatus.CREATED);

    }

    //método getProduct para listar apenas um produto, pelo id
    //id-- para que pegue o Id e não o índice. Sem o id-- ele vai puxar o id 1 como 0, o id 2 com 1 e assim sucessivamente
    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable("id") int id) {
        id--;
        return new ResponseEntity<>(products.get(id), HttpStatus.OK);

    }

    //método getProducts que vai listar todos os produtos. ResponseEntity retorna um objeto.
    //no return, serão apresentados os produtos(products) e o retorno do Http
    //anotação @RequestMapping indicando o caminho para acessar no navegador 
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<Object> getProducts() {

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    //método updateProduct para atualizar um produto da lista
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
        id--;
        products.remove(id);
        product.setId(id);

        return new ResponseEntity<>("Produto atualizado com sucesso!", HttpStatus.OK);
    }

    //método deleteProduct para remover um produto da lista
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") int id){
        id--;
        products.remove(id);
        return new ResponseEntity<>("Produto removido com sucesso!", HttpStatus.OK);
    }
}
