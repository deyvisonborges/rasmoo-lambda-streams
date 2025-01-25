import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStreams {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6);
    var result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList()
            );
    System.out.println(result);

    // Cria uma lista de transações
    List<Transaction> transactions = Arrays.asList(
            new Transaction(1, 100.50),
            new Transaction(2, 200.75),
            new Transaction(3, 50.25),
            new Transaction(4, 300.00),
            new Transaction(5, 150.10),
            new Transaction(6, 400.90)
    );

//    // Inicializa um Stream com as transações
//    Stream<Transaction> transactionStream = transactions.stream();

    // Exemplo de processamento no stream
    transactions.stream()
            .filter(t -> t.getValue() > 100) // Filtra transações com valor maior que 100
            .forEach(System.out::println);  // Imprime as transações filtradas
  }
}

class Transaction {
  private final int id;
  private final double value;

  public Transaction(int id, double value) {
    this.id = id;
    this.value = value;
  }

  public int getId() {
    return id;
  }

  public double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Transaction{id=" + id + ", value=" + value + "}";
  }
}
