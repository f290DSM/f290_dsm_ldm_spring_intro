package br.com.fatecararas.helloworld.services;

import br.com.fatecararas.helloworld.domain.entities.Filme;
import br.com.fatecararas.helloworld.repositories.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }

    public List<Filme> getAll() {
        return repository.findAll();
    }

    public void saveAll(List<Filme> filmes) {
        repository.saveAll(filmes);
    }

    public void save(Filme filme) {
        repository.save(filme);
    }
}
