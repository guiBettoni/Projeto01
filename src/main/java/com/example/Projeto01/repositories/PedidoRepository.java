package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
