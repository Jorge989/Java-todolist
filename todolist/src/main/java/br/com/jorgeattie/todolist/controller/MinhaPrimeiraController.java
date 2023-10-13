package br.com.jorgeattie.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeirRota ---
public class MinhaPrimeiraController {
    //*Métodos de acesso do HTTP
    //*GET - Buscar uma informação, POST - Adicionar um dado/informação */
    //*PUT - Alterar um dado/info, DELETE - Remover um dado, PATCH - Alterar somente um parte da info/dado */
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
