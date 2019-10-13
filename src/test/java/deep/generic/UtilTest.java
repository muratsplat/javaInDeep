package deep.generic;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

  @Test public void simpleCompare() {
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(2, "pear");
    boolean same = Util.<Integer, String>compare(p1, p2);
    assertFalse("expects false", same);


    Pair<Object, Object> p1a = new Pair<>(1, "apple");
    Pair<Object, Object> p2a = new Pair<>(2, "pear");
    boolean sameA = Util.<Object, Object>compare(p1a, p2a);
    assertFalse("expects false", sameA);

    Pair<Object, Object> p1b = new Pair<>(1, "apple");
    Pair<Object, Object> p2b = new Pair<>(1, "apple");
    boolean sameB = Util.<Object, Object>compare(p1b, p2b);
    assertTrue("expects they are same", sameB);
  }

}