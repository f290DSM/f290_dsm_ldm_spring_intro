package br.com.fatecararas.helloworld.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record FilmeFormData(Integer id, @NotBlank String titulo, @NotBlank String sinopse) {
}
