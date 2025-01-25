package operacoes_intermediarias;

import mock.Mock;

import java.time.Month;

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

  public static void main(String[] args) {
    exercice1();
    exercice2();
    exercice3();
  }
}



