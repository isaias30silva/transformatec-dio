/* Passos para a criação desta API:
 * 1 = Criação das pastas app, controllers e models
 * 2 - na pasta models foi criada a classe Product, contendo as definições de quais atributos os produtos terão
 * 3 - na pasta models foi criada a classe Cart, contendo os métodos que serão utilizados para utilizar as informações de compra
 * 4 - na pasta controllers foi criada a classe ProductServiceController, listando os endpoints para manipular a classe Product
 * 5 - adicionando o Swagger como dependencia para criar a documentação da API springfox-boot-starter e springfox-swagger-ui
 * 6 - criação da pasta config e dentro dela da classe SwaggerConfig.java
 * 7- após configurar a classe SwaggerConfig.java foi adicionada a anotação @EnableWebMvc nesta classe(Application) para habilitar o Swagger. Para acessar o Swagger, após executar o código, acesse no navegador:http://localhost:8080/swagger-ui/index.html
 * 8 - o próximo passo foi documentar os métodos na classe ProductServiceController
 * 
 */

package com.api.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@ComponentScan({"com.api.example"})
public class Application {
    
    public static void main(String[] args) {
        
        SpringApplication.run(Application.class, args);

    }
}
