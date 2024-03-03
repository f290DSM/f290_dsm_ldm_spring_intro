package br.com.fatecararas.helloworld;

import br.com.fatecararas.helloworld.domain.entities.Filme;
import br.com.fatecararas.helloworld.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HelloworldspringApplication implements CommandLineRunner {

    @Autowired
    private FilmeService service;

    public static void main(String[] args) {
        SpringApplication.run(HelloworldspringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var filme1 = Filme.builder()
                .titulo("Episodio I - A ameaça Fantasma")
                .sinopse("Lorem ipsum dolor sit amet...")
                .build();

        var filme2 = Filme.builder()
                .titulo("Episodio II - O ataque dos clones")
                .sinopse("Lorem ipsum dolor sit amet...")
                .build();

        var filme3 = Filme.builder()
                .titulo("Episodio III - A vingança dos Sith")
                .sinopse("Lorem ipsum dolor sit amet...")
                .build();
        List<Filme> filmes = List.of(filme1, filme2, filme3);

        // Descomentar para persistir 3 filmes iniciais
//        service.saveAll(filmes);
        System.out.println(service.getAll());
    }
}
