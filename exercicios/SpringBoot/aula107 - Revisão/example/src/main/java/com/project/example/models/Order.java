package com.project.example.models;

public class Order {

    //criação dos parâmetros
    private int id;
    private Double amount;
    private Double rate;
    
    //construtor vazio
    public Order() {
        super();
    }

    //construtor sobrecarregado
    public Order(int id, Double amount, Double rate){
        this.id = id;
        this.amount = amount;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

}

