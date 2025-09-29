package com.projetofinal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
    @RequestMapping(value = "/alterar/{idPessoaDesaparecida}", method = RequestMethod.GET)
    public ModelAndView alterar(@PathVariable("idPessoaDesaparecida") long idPessoaDesaparecida) {
        PessoaDesaparecida pessoa = csr.findByIdPessoaDesaparecida(idPessoaDesaparecida);
        ModelAndView mv = new ModelAndView("alterar");
        mv.addObject("pessoa", pessoa);
        return mv;
    }

    @RequestMapping(value = "/alterar/{idPessoaDesaparecida}", method = RequestMethod.POST)
    public String alterar(@Validated PessoaDesaparecida pessoa, BindingResult result, RedirectAttributes attributes) {
        csr.save(pessoa);
        return "redirect:/listar";
    }

    // Excluir
    @RequestMapping("/confirmarExclusao/{idPessoaDesaparecida}")
    public ModelAndView confirmarExclusao(@PathVariable("idPessoaDesaparecida") long idPessoaDesaparecida) {
        PessoaDesaparecida pessoa = csr.findByIdPessoaDesaparecida(idPessoaDesaparecida);
        ModelAndView mv = new ModelAndView("excluir");
        mv.addObject("pessoa", pessoa);
        return mv;
    }

    @RequestMapping("/excluir")
    public String excluir(long idPessoaDesaparecida) {
        PessoaDesaparecida pessoa = csr.findByIdPessoaDesaparecida(idPessoaDesaparecida);
        csr.delete(pessoa);
        return "redirect:/listar";
    }

}
