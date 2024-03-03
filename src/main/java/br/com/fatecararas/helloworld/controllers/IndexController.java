package br.com.fatecararas.helloworld.controllers;

import br.com.fatecararas.helloworld.domain.entities.Filme;
import br.com.fatecararas.helloworld.services.FilmeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    private final FilmeService service;

    public IndexController(FilmeService service) {
        this.service = service;
    }

    @GetMapping("/filmes")
    public String index(Model model) {
        List<Filme> filmes = service.getAll();
        model.addAttribute("title", "Primeira View Thymeleaf");
        model.addAttribute("filmes", filmes);
        return "index";
    }

    @ModelAttribute("filme")
    public Filme getFilmeDestaque() {
        return new Filme(1,
                "Maverick",
                "Continuação de Ases Indomáveis...");
    }
}

