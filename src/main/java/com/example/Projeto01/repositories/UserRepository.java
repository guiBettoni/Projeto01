package com.example.Projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto01.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
