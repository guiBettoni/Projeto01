package com.example.Projeto01.models;

import java.time.LocalDate;
import java.util.Objects;

import com.example.Projeto01.models.Pedido.CreatePedido;

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
@Table(name = Item.TABLE_NAME)
public class Item {
  public interface CreateItem {
  }

  public interface UpdateItem {
  }

  public static final String TABLE_NAME = "item";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private Long id;

  @Column(name = "produto", nullable = false)
  @NotNull(groups = CreateItem.class)
  private String produto;

  @Column(name = "quantidade", nullable = false)
  @NotNull(groups = CreateItem.class)
  private Integer quantidade;

  @ManyToOne
  @JoinColumn(name = "pedido_id", nullable = false)
  @NotNull(groups = CreateItem.class)
  private Pedido pedido;

  public Item() {
  }

  public Item(Long id, String produto, Integer quantidade, Pedido pedido) {
    this.id = id;
    this.produto = produto;
    this.quantidade = quantidade;
    this.pedido = pedido;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProduto() {
    return this.produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }

  public Integer getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Pedido getPedido() {
    return this.pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Item item = (Item) o;
    return Objects.equals(id, item.id)
        && Objects.equals(produto, item.produto)
        && Objects.equals(quantidade, item.quantidade)
        && Objects.equals(pedido, item.pedido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, produto, quantidade, pedido);
  }

}
