package deep.generic.unboundedwildcards;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
public class UtilTest {

  @Test public void toStringTest() {

    List<Integer> li = Arrays.asList(1, 2, 3);
    List<String>  ls = Arrays.asList("one", "two", "three");
    // String actual = Util.toString(li);// UtilTest.java:14: error: incompatible types: List<Integer> cannot be converted to List<Object>
    String actual2 = Util.toStringWildCard(ls);

    assertEquals("one two three", actual2);

    // String actual = Util.toString(li);// UtilTest.java:14: error: incompatible types: List<Integer> cannot be converted to List<Object>
    String actual = Util.toStringWildCard(li);
    assertEquals("1 2 3", actual);
  }

  @Test public void addNumbers() {

    List<Integer> li = Arrays.<Integer>asList();
    List<Integer> expected = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10);
    // String actual = Util.toString(li);// UtilTest.java:14: error: incompatible types: List<Integer> cannot be converted to List<Object>
    try {
      Util.addNumbers(li);
      assertEquals(expected, li);

    } catch (UnsupportedOperationException e) {
      // https://stackoverflow.com/questions/24184256/unsupported-operation-on-abstractlist-add/24184446
      // So "li" can not  overwrite..
    }

    List<Integer> expected2 = new ArrayList<Integer>(li);
    Util.addNumbers(expected2);
    assertEquals(expected, expected2);


    List<Number> expected3 = new ArrayList<Number>();
    expected3.addAll(li
      .stream()
      .map(n -> n.longValue())
      .collect(Collectors.toList()));

    Util.addNumbers(expected3);
    assertEquals(expected, expected3);
  }

}