package deep.generic.typeinference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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

}