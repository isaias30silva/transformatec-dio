package com.api.example.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    
    private List<Product> items = new ArrayList<Product>();
    private int id;

    public Cart(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void insertProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public List<Product> getProducts() {
        return items;
    }

    public int countProducts() {
        return items.size();
    }
}
