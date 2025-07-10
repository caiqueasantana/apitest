package com.exemplo.livros.controller;

import com.exemplo.livros.dto.LivroDTO;
import com.exemplo.livros.model.Livro;
import com.exemplo.livros.service.LivroService;
import com.exemplo.livros.mapper.LivroMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroDTO> criar(@Valid @RequestBody LivroDTO livroDTO) {
        Livro livro = LivroMapper.toEntity(livroDTO);
        Livro salvo = livroService.salvar(livro);
        return ResponseEntity.ok(LivroMapper.toDTO(salvo));
    }

    @GetMapping
    public ResponseEntity<List<LivroDTO>> listarTodos() {
        List<LivroDTO> livros = livroService.listarTodos()
                .stream()
                .map(LivroMapper::toDTO)
                .toList();
        return ResponseEntity.ok(livros);
    }
    @GetMapping("/ping")
public String ping() {
    return "pong";
}

}
