package mock.entities;

import java.util.UUID;

public class ItemPedido {
  private UUID id;
  private Produto produto;
  private int amount;

  public ItemPedido(Produto produto, int amount) {
    this.id = UUID.randomUUID();
    this.produto = produto;
    this.amount = amount;
  }
  public Double getPrice() {
    return produto.getPrice() * this.amount;
  }

  public UUID getId() {
    return id;
  }

  public Produto getProduct() {
    return produto;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "{ product=" + produto + ", amount=" + amount + " }";
  }
}
