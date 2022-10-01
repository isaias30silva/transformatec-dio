/* Passos para a criação desta API:
 * 1 = Criação das pastas app, controllers e models
 * 2 - na pasta models foi criada a classe Product, contendo as definições de quais atributos os produtos terão
 * 3 - na pasta models foi criada a classe Cart, contendo os métodos que serão utilizados para utilizar as informações de compra
 * 4 - na pasta controllers foi criada a classe ProductServiceController, listando os endpoints para manipular a classe Product
 */

package com.api.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.api.example")
public class Application {
    
    public static void main(String[] args) {
        
        SpringApplication.run(Application.class, args);

    }
}
