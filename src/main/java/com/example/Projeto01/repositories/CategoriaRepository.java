package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
