package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
