package com.exemplo.livros.service;

import com.exemplo.livros.model.Livro;
import com.exemplo.livros.repository.LivroRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class LivroServiceTest {

    @Test
    void listarTodos_deveRetornarListaDeLivros() {
        LivroRepository mockRepo = mock(LivroRepository.class);
        LivroService service = new LivroService(mockRepo);

        Livro livro = new Livro(1L, "Livro Teste", "Autor", 2020);
        when(mockRepo.findAll()).thenReturn(List.of(livro));

        List<Livro> resultado = service.listarTodos();

        assertThat(resultado).hasSize(1);
        assertThat(resultado.get(0).getTitulo()).isEqualTo("Livro Teste");
        verify(mockRepo, times(1)).findAll();
    }
}