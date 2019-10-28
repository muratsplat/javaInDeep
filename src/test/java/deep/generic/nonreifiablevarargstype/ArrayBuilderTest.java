package deep.generic.nonreifiablevarargstype;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBuilderTest {

  @Test public void simple() {
    List<String> stringListA = new ArrayList<String>();
    List<String> stringListB = new ArrayList<String>();

    ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
    ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
    List<List<String>> listOfStringLists =
      new ArrayList<List<String>>();
    ArrayBuilder.addToList(listOfStringLists,
      stringListA, stringListB);

    ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
  }

}