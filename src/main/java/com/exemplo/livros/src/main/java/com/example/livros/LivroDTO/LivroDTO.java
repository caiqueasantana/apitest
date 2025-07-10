package com.exemplo.livros.dto;

import jakarta.validation.constraints.*;

public record LivroDTO(
    @NotBlank(message = "O título é obrigatório.")
    String titulo,

    @NotBlank(message = "O autor é obrigatório.")
    String autor,

    @Min(value = 1500, message = "O ano de publicação deve ser no mínimo 1500.")
    @Max(value = 2100, message = "O ano de publicação deve ser no máximo 2100.")
    int anoPublicacao
) {}