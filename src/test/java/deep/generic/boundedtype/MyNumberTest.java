package deep.generic.boundedtype;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyNumberTest {

  @Test public void simple() {
    MyNumber<Integer> foo = new MyNumber<Integer>(0);
    assertTrue("it is even", foo.isEven());
  }

}