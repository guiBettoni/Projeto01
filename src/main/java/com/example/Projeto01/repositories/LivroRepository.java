package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
