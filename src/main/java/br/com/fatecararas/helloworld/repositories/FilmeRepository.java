package br.com.fatecararas.helloworld.repositories;

import br.com.fatecararas.helloworld.domain.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
