package deep.generic.boundedtypeparams;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import java.lang.Comparable;
// import static org.junit.Assert.*;

public class FooTest {

  @Test public void simple() {
    ArrayList<Comparable<Integer>>  numbers = new ArrayList<Comparable<Integer>>();
    numbers.add(new Integer(2));
    Foo.countGreaterThan(numbers, new Long(1));
    // Foo.<Compare<Integer>>.clone();
  }

}