package com.aula104.exemplo;

import org.springframework.stereotype.Service;

@Service
public class ComedyWriter implements WriterInterface{

    @Override
    public void write(String bookName) {

        System.out.println("Escrevendo o livro: " + bookName);
    }

    @Override
    public void publish(String bookName) {

        System.out.println("Publicando o livro: " + bookName);

        
    }
    
}
