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
@Table(name = Editora.TABLE_NAME)
public class Editora {
  public interface CreateEditora {

  }

  public interface UpdateEditora {

  }

  public static final String TABLE_NAME = "editora";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private Long id;

  @Column(name = "nome", nullable = false, length = 100)
  @NotNull(groups = CreateEditora.class)
  @NotEmpty(groups = CreateEditora.class)
  @Size(groups = CreateEditora.class, min = 2, max = 100)
  private String nome;

  @Column(name = "endereco", nullable = false, length = 200)
  @NotNull(groups = CreateEditora.class)
  @NotEmpty(groups = CreateEditora.class)
  @Size(groups = CreateEditora.class, min = 2, max = 200)
  private String endereco;

  public Editora() {
  }

  public Editora(Long id, String nome, String endereco) {
    this.id = id;
    this.nome = nome;
    this.endereco = endereco;
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

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Editora editora = (Editora) o;
    return Objects.equals(id, editora.id)
        && Objects.equals(nome, editora.nome)
        && Objects.equals(endereco, editora.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, endereco);
  }

}
