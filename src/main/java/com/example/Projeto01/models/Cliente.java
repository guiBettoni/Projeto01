package com.example.Projeto01.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = Cliente.TABLE_NAME)
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

  public Cliente() {
  }

  public Cliente(Long id, String nome, String email) {
    this.id = id;
    this.nome = nome;
    this.email = email;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Cliente cliente = (Cliente) o;
    return Objects.equals(id, cliente.id)
        && Objects.equals(nome, cliente.nome)
        && Objects.equals(email, cliente.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, email);
  }

}
