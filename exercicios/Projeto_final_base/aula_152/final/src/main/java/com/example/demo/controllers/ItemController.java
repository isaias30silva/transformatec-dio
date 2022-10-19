package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Item;
import com.example.demo.repositories.ItemRepository;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private TodoDoInterface todoDoInterface;


    //Método para registro de novo item
    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {

        //Consumindo a API do JSON Placeholder
        TodoResponse todo = todoDoInterface.getTodoById(item.getTodoId());

        System.out.println(todo);

        Item _item = itemRepository.save(item);

        return new ResponseEntity<Item>(_item, HttpStatus.CREATED);
    }

    //Método para pesquisa de um item
    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getByid(@PathVariable("id") long id) {

        Item _item = itemRepository.findById(id);

        return new ResponseEntity<Item>(_item, HttpStatus.OK);
    }

    //Método para listagem de todos os items
    @GetMapping("/items")
    public ResponseEntity<List<Item>> listItem() {

        List<Item> _items = itemRepository.findAll();

        if(_items.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Item>>(_items, HttpStatus.OK);
    }
    
    //Método para listagem de items de um usuário
    @GetMapping("/users/{id}/items")
    public ResponseEntity<List<Item>> listItemsByUserId(@PathVariable("u_id") long id) {

        List<Item> _items = itemRepository.findByUser(id);

        if(_items.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Item>>(_items, HttpStatus.OK);
    }

    @GetMapping("/items/status")
    public ResponseEntity<List<Item>> listItemsByStatus(@RequestParam boolean status) {

        List<Item> items = itemRepository.findByStatus(status);

        if(items.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    }
}
