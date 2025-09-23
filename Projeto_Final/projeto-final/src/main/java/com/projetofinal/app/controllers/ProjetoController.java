package com.projetofinal.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjetoController {
    // Index
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // TODO
    // Cadastrar
    // Listar
    // Excluir
}
