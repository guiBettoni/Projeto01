package com.example.Projeto01.models;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = Pedido.TABLE_NAME)
public class Pedido {
  public interface CreatePedido {
  }

  public interface UpdatePedido {
  }

  public static final String TABLE_NAME = "pedido";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private Long id;

  @Column(name = "data", nullable = false)
  @NotNull(groups = CreatePedido.class)
  private LocalDate data;

  @ManyToOne
  @JoinColumn(name = "cliente_id", nullable = false)
  @NotNull(groups = CreatePedido.class)
  private Cliente cliente;

  public Pedido() {
  }

  public Pedido(Long id, LocalDate data, Cliente cliente) {
    this.id = id;
    this.data = data;
    this.cliente = cliente;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getData() {
    return this.data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Pedido pedido = (Pedido) o;
    return Objects.equals(id, pedido.id)
        && Objects.equals(data, pedido.data)
        && Objects.equals(cliente, pedido.cliente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data, cliente);
  }

}
