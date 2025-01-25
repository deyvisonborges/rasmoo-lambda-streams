package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
  public static void main(String[] args) {
    List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8)
    );

    // Usando flatMap para achatar a lista de listas
    List<Integer> flatList = listOfLists.stream()
            .flatMap(List::stream)  // Achata as listas internas em um único stream
            .collect(Collectors.toList());

    List<List<String>> names = List.of(List.of("Deyvison", "Bruno"));
    System.out.println(names.stream().flatMap(n -> n.stream()).toList());
    System.out.println(flatList);  // [1, 2, 3, 4, 5, 6, 7, 8]
  }
}
