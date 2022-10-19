package com.example.demo.interfaces;

//Interface de consulta de Todos na API do JSON Placeholder
@FeignClient(url = "http://jsonplaceholder.typicode.com/todos", name="jsonplaceholder")
public interface TodoDoInterface {

    @GetMapping("/{id}")
    TodoResponse getTodoById(long id);
    
}
