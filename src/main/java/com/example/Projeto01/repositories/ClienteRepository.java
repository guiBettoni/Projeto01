package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
