package operacoes_intermediarias;

import mock.Mock;

import java.time.Month;
import java.util.List;
import java.util.UUID;

public class Filter {
  // retornar uma lista de clientes que comecam com as letras "MA"
  public static void exercice1() {
    var clientes = Mock.clientes();

    var result = clientes.stream()
      // o Java é case sensitive
      .filter(c -> c.getName().toUpperCase().startsWith("MA"))
      .toList();
    System.out.println(result);
  }

  // retornar uma lista com todos os produtos que possuem o preco maior que R$ 2.000,00
  public static void exercice2() {
    var produtos = Mock.produtos();
    var result = produtos.stream()
      .filter(produto -> produto.getPrice() > 2000)
      .toList();
    System.out.println(result);
  }

  // retornar uma lista com todos os pedidos feitos
  // por clientes que fazem aniversario no mes de agosto
  public static void exercice3() {
    var pedidos = Mock.pedidos();
    var result = pedidos.stream()
      .filter(pedido -> pedido.getClient().getBirthDate().getMonth().equals(Month.AUGUST))
      .toList();
    System.out.println(result);
  }

  public static void exercice4() {
    // Retornar uma lista com todos os pedidos feitos por clientes que fazem aniversário no mês de agosto
    var pedidos = Mock.pedidos();
    var clientes = Mock.clientes();

    // Obter IDs de clientes que fazem aniversário em agosto
    List<UUID> clientesAniversariantesAgosto = clientes.stream()
      .filter(c -> c.getBirthDate().getMonth() == Month.AUGUST)
      .map(c -> c.getId())
      .toList();

    // Filtrar pedidos com base nos IDs dos clientes
    var result = pedidos.stream()
      .filter(p -> clientesAniversariantesAgosto.contains(p.getClient().getId()))
      .toList();

    System.out.println(result);
  }

  public static void main(String[] args) {
    exercice1();
    exercice2();
    exercice3();
    exercice4();
  }
}



