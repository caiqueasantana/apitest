package com.exemplo.livros.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório.")
    private String titulo;

    @NotBlank(message = "O autor é obrigatório.")
    private String autor;

    @Min(value = 1500, message = "O ano de publicação deve ser no mínimo 1500.")
    @Max(value = 2100, message = "O ano de publicação deve ser no máximo 2100.")
    private int anoPublicacao;
}
