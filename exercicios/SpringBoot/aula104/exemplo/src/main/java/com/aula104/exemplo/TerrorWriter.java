package com.aula104.exemplo;

public class TerrorWriter implements WriterInterface {

    @Override
    public void write(String bookName) {

        System.out.println("Escrevendo o livro: " + bookName);
    }

    @Override
    public void publish(String bookName) {

        System.out.println("Escrevendo o livro: " + bookName);

        
    }
    
}
