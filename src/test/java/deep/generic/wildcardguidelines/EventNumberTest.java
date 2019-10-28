package deep.generic.wildcardguidelines;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class EventNumberTest {

  @Test public void simple() {
    List<EvenNumber> le = new ArrayList<>();
    List<? extends MyNumber> lm = le;
    // lm.add( new MyNumber(1)); compile error : The method add(capture#1-of ? extends MyNumber) in the type List<capture#1-of ? extends MyNumber> is not applicable for the arguments (MyNumber)
    lm.add(null);
    assertEquals(1, lm.size()); // Java is superb safe  :) 
  }

}