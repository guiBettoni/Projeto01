package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
