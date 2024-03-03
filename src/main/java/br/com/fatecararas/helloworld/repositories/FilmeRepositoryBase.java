package br.com.fatecararas.helloworld.repositories;

import br.com.fatecararas.helloworld.domain.entities.Filme;

import java.util.List;

public interface FilmeRepositoryBase {
    List<Filme> getAll();
}
