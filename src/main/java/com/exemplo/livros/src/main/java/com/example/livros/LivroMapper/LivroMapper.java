package com.exemplo.livros.mapper;

import com.exemplo.livros.dto.LivroDTO;
import com.exemplo.livros.model.Livro;

public class LivroMapper {

    public static Livro toEntity(LivroDTO dto) {
        Livro livro = new Livro();
        livro.setTitulo(dto.titulo());
        livro.setAutor(dto.autor());
        livro.setAnoPublicacao(dto.anoPublicacao());
        return livro;
    }

    public static LivroDTO toDTO(Livro livro) {
        return new LivroDTO(
            livro.getTitulo(),
            livro.getAutor(),
            livro.getAnoPublicacao()
        );
    }
}