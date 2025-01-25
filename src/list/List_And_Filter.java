package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_And_Filter {
  public static void main(String[] args) {
    /**
     * Cria uma lista imutável. Qualquer tentativa de modificar (adicionar, remover ou alterar elementos) resultará em uma UnsupportedOperationException.
     */
    List<String> namesArrays = Arrays.asList("Deyvison", "Bruno", "Borges");
    List<String> namesList = List.of("Deyvison", "Bruno", "Borges"); // feature do java 9
    List<String> namesAL = new ArrayList<>(List.of("Deyvison", "Bruno", "Borges"));

    for (String name : namesArrays) {
      if(name.contains("b")) {
        name += "alter";
      }
    }

    System.out.println(namesArrays);
    System.out.println(namesList);
    System.out.println(namesAL);
  }
}
