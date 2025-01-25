import java.util.ArrayList;
import java.util.List;

public class ArrayListInitialization {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(){{
      add("Deyvison");
      add("Borges");
      add("Borg");
      add("Deyv");
    }};
    System.out.println(names);
  }
}
