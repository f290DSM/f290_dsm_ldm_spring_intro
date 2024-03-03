package br.com.fatecararas.helloworld.repositories;

import br.com.fatecararas.helloworld.domain.entities.Filme;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmeRepositoryBaseInMemoryImpl implements FilmeRepositoryBase {
    @Override
    public List<Filme> getAll() {
        return List.of(
                new Filme(1,
                        "Episodio I - A ameaça Fantasma",
                        "Lorem ipsum dolor sit amet..."),
                new Filme(2,
                        "Episodio II - O ataque dos clones",
                        "Lorem ipsum dolor sit amet..."),
                new Filme(3,
                        "Episodio III - A vingança dos Sith",
                        "Lorem ipsum dolor sit amet...")
        );
    }
}
