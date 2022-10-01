package com.api.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//essa anotação informa que esta é a classe de configuração da API
@Configuration
public class SwaggerConfig {
    
    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.api.example"))
                    .build()
                    .useDefaultResponseMessages(false)
                    .apiInfo(apiInfo());
        
    }

    //configuração do cabeçalho do Swagger, com as informações principais da API
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                    .title("API de Produtos")
                    .description("Um exemplo de API documentada")
                    .version("1.0.0")
                    .license("Apache License Version 2.0")
                    .contact(new Contact("Isaias", "https://github.com/isaias30silva", "isaias30silva@gmail.com"))
                    .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                    .build();
    }
}
