package deep.generic.typeinference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import deep.generic.boundedtype.Box;

public class TypeinferenceTest {

  @Test public void simple() {
    ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
    Typeinference.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
    Typeinference.addBox(Integer.valueOf(20), listOfIntegerBoxes);
    Typeinference.addBox(Integer.valueOf(30), listOfIntegerBoxes);
    String actual = Typeinference.outputBoxes(listOfIntegerBoxes);

    assertEquals("0,10 1,20 2,30", actual);

    ArrayList<Box<Long>> listOfLongBoxes = new ArrayList<>();
    Typeinference.addBox(10L, listOfLongBoxes);
    Typeinference.addBox(20L, listOfLongBoxes);
    Typeinference.addBox(30L, listOfLongBoxes);
    String actual1 = Typeinference.outputBoxes(listOfLongBoxes);

    assertEquals("0,10 1,20 2,30", actual1);
  }

  @Test public void two() {
    Map<String, List<String>> myMap = new HashMap<>();
    myMap.put("soo", new ArrayList<String>());
    // Map<String, List<String>> myMapUnSafe = new HashMap(); // unchecked conversion warning
    // myMapUnSafe.put("foo", new ArrayList<String>());

  }

  @Test public void three() {
    new MyGenericClass<Integer>("");
    new MyGenericClass<Long>("");
    MyGenericClass<Long> foo =  new MyGenericClass<>(1L);
    MyGenericClass<String> boo =  new MyGenericClass<>("sdsd");


  }
}