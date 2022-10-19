package com.example.demo.payload.response;

//Classe com os atributos do Todo retornado da API do JSON Placeholder
public class TodoResponse {

    private Long userId;
    private Long id;
    private String title;
    private double completed;
    
    public TodoResponse() {
    }

    public TodoResponse(Long userId, Long id, String title, double completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCompleted() {
        return completed;
    }

    public void setCompleted(double completed) {
        this.completed = completed;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
}
