package com.example.Projeto01.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Cliente {
  public interface CreateCliente {
  }

  public interface UpdateCliente {
  }

  public static final String TABLE_NAME = "cliente";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private Long id;

  @Column(name = "nome", nullable = false, length = 100)
  @NotNull(groups = CreateCliente.class)
  @NotEmpty(groups = CreateCliente.class)
  @Size(groups = CreateCliente.class, min = 2, max = 100)
  private String nome;

  @Column(name = "email", nullable = false, length = 100, unique = true)
  @NotNull(groups = CreateCliente.class)
  @NotEmpty(groups = CreateCliente.class)
  @Size(groups = CreateCliente.class, min = 2, max = 100)
  private String email;
}
