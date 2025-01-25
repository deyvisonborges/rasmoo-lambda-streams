package mock.entities;

import java.util.List;
import java.util.UUID;

public class Pedido {
  private UUID id;
  private Cliente cliente;
  private List<ItemPedido> items;
  private Double price;

  public Pedido(Cliente client, List<ItemPedido> items) {
    this.id = UUID.randomUUID();
    this.cliente = client;
    this.items = items;

    this.calculatePrice();
  }

  public UUID getId() {
    return id;
  }

  public Cliente getClient() {
    return cliente;
  }

  public List<ItemPedido> getItems() {
    return items;
  }

  public Double getPrice() {
    return this.price;
  }

  private void calculatePrice() {
    this.price = this.items.stream()
      .map(ItemPedido::getPrice)
      .reduce(0d, Double::sum);
  }

  @Override
  public String toString() {
    return "{ client=" + cliente + ", price=" + String.format("%.2f", getPrice()) + ", items=" + items + " }";
  }
}
