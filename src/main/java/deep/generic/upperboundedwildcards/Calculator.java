package deep.generic.upperboundedwildcards;

import java.util.List;
// https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html

public class Calculator {
  public static Number doIt(List<? extends Number> numbers) {
    return numbers.stream().mapToDouble(n -> n.doubleValue()).sum();
  }

  public static Number doIt(Number[] numbers) {
    Double total = new Double(0);
    for (Number number : numbers) {
      total += number.doubleValue();
    }
    return total;
  }
}