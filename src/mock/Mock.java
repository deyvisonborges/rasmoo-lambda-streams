package mock;

import mock.entities.Cliente;
import mock.entities.ItemPedido;
import mock.entities.Pedido;
import mock.entities.Produto;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Mock {

  static List<String> namesList() {
    return List.of("Deyvion", "Borges", "Bruno", "Maranhao");
  }

  static List<Integer> numbers = List.of(12, 3, 4, 5, 67, 230);

  public static List<Cliente> clientes() {
    return List.of(
      new Cliente("Pedro", LocalDate.of(1964, 1, 7)),
      new Cliente("Pedro", LocalDate.of(1992, 8, 28)),
      new Cliente("Ana", LocalDate.of(1993, 4, 1)),
      new Cliente("Marcos", LocalDate.of(1988, 3, 15)),
      new Cliente("Vanessa", LocalDate.of(1990, 8, 25)),
      new Cliente("Marcia", LocalDate.of(1963, 8, 9)),
      new Cliente("Mateus", LocalDate.of(1997, 6, 18)),
      new Cliente("Cristina", LocalDate.of(1964, 5, 12)),
      new Cliente("Leonardo", LocalDate.of(1998, 10, 27)),
      new Cliente("Larissa", LocalDate.of(1998, 9, 7)),
      new Cliente("Larissa", LocalDate.of(1991, 12, 17)),
      new Cliente("Marcelo", LocalDate.of(1998, 4, 11))
    );
  }

  public static List<Produto> produtos() {
    return List.of(
      new Produto("Iphone 15", 4899d),
      new Produto("Airpods Pro 2", 1799.99),
      new Produto("Macbook Pro", 15699.99),
      new Produto("Galaxy S24", 4799d),
      new Produto("Dell Inspiron", 3329d),
      new Produto("Elements Lunari", 2797.10),
      new Produto("Elements Magna", 2199.50),
      new Produto("Nintendo Switch OLED", 2299.90),
      new Produto("Headset Gamer Astro A50", 1399.99),
      new Produto("Headset Gamer Redragon Hero", 199.90),
      new Produto("Headset Gamer HyperX Cloud Stinger 2", 239.99),
      new Produto("Teclado Redragon Kumara Pro", 295.11),
      new Produto("Teclado Logitech MX Keys Mini", 639.99),
      new Produto("Teclado HyperX Allow MKW100", 2699.99),
      new Produto("Quest 2", 1824.27),
      new Produto("Meta Quest 3", 4405.05),
      new Produto("Epson Powerlite E20", 3149d),
      new Produto("Samsung The Freestyle 2", 3656.46),
      new Produto("Echo Show 15", 1749.99)
    );
  }

  public static List<Pedido> pedidos() {
    List<Produto> produtos = new ArrayList<>(produtos());
    Random random = new Random();

    return clientes().stream()
      .map(cliente -> {
        Collections.shuffle(produtos);
        List<ItemPedido> items = produtos.stream()
          .limit(random.nextInt(1, 6)) // Define um limite aleatório de itens por pedido
          .map(produto -> new ItemPedido(produto, random.nextInt(1, 5)))
          .collect(Collectors.toList());
        return new Pedido(cliente, items);
      })
      .collect(Collectors.toList());
  }
}
