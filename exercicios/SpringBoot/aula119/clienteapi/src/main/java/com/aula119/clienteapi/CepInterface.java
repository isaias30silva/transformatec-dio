package com.aula119.clienteapi;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface CepInterface {
    

    //Obter endereço de um cep informado
    @GetMapping("{cep}/json")
    Address getAddressByCep(@PathVariable("cep") String cep);

    //Obter lista de endereços por descrição
    @GetMapping("{uf}/{cidade}/{logradouro}/json")
    List<Address> getAddressesByDescription(
        @PathVariable("uf") String uf, @PathVariable("cidade") String cidade, @PathVariable("logradouro") String logradouro
    );
}
