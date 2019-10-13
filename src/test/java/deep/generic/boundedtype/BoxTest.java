package deep.generic.boundedtype;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoxTest {

  @Test public void simpleCompare() {
    Box<Integer> integerBox = new Box<Integer>();
    integerBox.setT(new Integer(10));
    String r = integerBox.inspect(new Integer(1)); // error: this is still String!
    assertEquals("T:java.lang.Integer,U:java.lang.Integer", r);

    r = integerBox.inspect((long)1); // error: this is still String!
    assertEquals("T:java.lang.Integer,U:java.lang.Long", r);
  }

}