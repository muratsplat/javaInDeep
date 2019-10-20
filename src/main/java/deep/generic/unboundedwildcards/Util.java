package deep.generic.unboundedwildcards;

import java.util.List;

public class Util  {

  public static String toString(List<Object> list) {
    String out = "";
    for (Object elem: list) {
      out += elem + " ";
    }
    return out.trim();
  }
  
  public static String toStringWildCard(List<?> list) {
    String out = "";
    for (Object elem: list) {
      out += elem + " ";
    }
    return out.trim();
  }

  public static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
      list.add(i);
    } 
  }
  
}