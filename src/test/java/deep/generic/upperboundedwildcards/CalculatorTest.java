package deep.generic.upperboundedwildcards;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CalculatorTest {

  @Test public void doItTest() {
    List<Integer> ints = Arrays.asList(1,4,9);
    Number actual = Calculator.doIt(ints);
    assertEquals(14.0, actual);

    List<Number> numbers = Arrays.asList(1L,4.0,9);
    Double actual2 = Calculator.doIt(numbers).doubleValue();
    assertEquals(new Double(14.0), actual2);
    
    Number[] numbers3 = {1L,4.0,9};
    Number actual3 = Calculator.doIt(numbers3);
    assertEquals(new Double(14.0), actual3);
  }

}