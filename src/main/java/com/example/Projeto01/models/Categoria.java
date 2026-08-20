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
@Table(name = Categoria.TABLE_NAME)
public class Categoria {
  public interface CreateCategoria {

  }

  public interface UpdateCategoria {

  }

  public static final String TABLE_NAME = "categoria";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private Long id;

  @Column(name = "nome", nullable = false, length = 100)
  @NotNull(groups = CreateCategoria.class)
  @NotEmpty(groups = CreateCategoria.class)
  @Size(groups = CreateCategoria.class, min = 2, max = 100)
  private String nome;

  @Column(name = "descricao", nullable = false, length = 200)
  @NotNull(groups = CreateCategoria.class)
  @NotEmpty(groups = CreateCategoria.class)
  @Size(groups = CreateCategoria.class, min = 2, max = 200)
  private String descricao;

  public Categoria() {
  }

  public Categoria(Long id, String nome, String descricao) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
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

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Categoria categoria = (Categoria) o;
    return Objects.equals(id, categoria.id)
        && Objects.equals(nome, categoria.nome)
        && Objects.equals(descricao, categoria.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao);
  }

}
