package com.telas.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class telasController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/cadastro")
    public String cadastrar() {
        return "cadastro";
    }
}
