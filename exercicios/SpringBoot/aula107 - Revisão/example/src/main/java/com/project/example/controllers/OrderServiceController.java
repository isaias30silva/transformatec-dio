package com.project.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.example.models.Order;

import io.swagger.annotations.ApiOperation;

@RestController
public class OrderServiceController {

    private static List<Order> orderList = new ArrayList<Order>();

    //adicionando elementos na lista de ordem
    static {
        orderList.add(new Order(0, 10.0, 18000.0));
        orderList.add(new Order(1, 0.5, 150000.0));
        orderList.add(new Order(2, 0.5, 125000.0));
    }

    //criação do método getOrder
    //ResponseEntity retorna uma resposta da API
    @ApiOperation(value = "Buscando uma ordem por Id especificado")
    @RequestMapping(value="/orders/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getOrder(@PathVariable("id") int id) {
        return new ResponseEntity<>(orderList.get(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Listando todas as ordens")
    @RequestMapping(value = "/orders/", method = RequestMethod.GET)
    public ResponseEntity<Object> getOrders() {
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }
    
    @ApiOperation(value = "Criando uma nova ordem")
    @RequestMapping(value="/orders", method = RequestMethod.POST)
    public ResponseEntity<Object> createOrder(@RequestBody Order order) {

        orderList.add(order);
        return new ResponseEntity<>("Ordem criada!", HttpStatus.OK);
    }
    
}
