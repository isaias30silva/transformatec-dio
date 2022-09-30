package com.aula104.exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterBean {
    
    private WriterInterface writer;

    //Injeção de dependências
    @Autowired
    public void setWriter(WriterInterface writer) {
        this.writer = writer;
    }

    public void run() {

        String bookName = "Debie e Lóide";
        writer.write(bookName);
        writer.publish(bookName);
    }
}


