package com.projetofinal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.projetofinal.app.models.PessoaDesaparecida;
import com.projetofinal.app.repository.AppRepository;

@Controller
public class ProjetoController {
    @Autowired
    private AppRepository csr;

    // Index
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // Cadastrar
    @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
    public String cadastrar() {
        return "cadastrar";
    }

    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public String cadastrar(PessoaDesaparecida pessoa) {
        csr.save(pessoa);
        return "redirect:/";
    }

    // Listar
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("listar");
        Iterable<PessoaDesaparecida> pessoas = csr.findAll();
        mv.addObject("pessoas", pessoas);
        return mv;
    }
    
    // Alterar
    // Excluir
}
