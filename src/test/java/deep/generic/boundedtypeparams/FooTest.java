package deep.generic.boundedtypeparams;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// import static org.junit.Assert.*;

// https://docs.oracle.com/javase/tutorial/java/generics/boundedTypeParams.html
public class FooTest {

  @Test public void simple() {
    /// https://stackoverflow.com/questions/49638534/generic-methods-and-bounded-type-parameters
    Integer[] numbers = new Integer[]{1,2,3,4}; 
    int actual = Foo.countGreaterThan(numbers, 0);
    assertEquals(4, actual);

    Long[] longNumbers = new Long[]{1L,2L,3L,4L}; 
    actual = Foo.countGreaterThan(longNumbers, 0L);
    assertEquals(4, actual);


    String[] Strings = new String[]{"b","c","d","e"}; 
    actual = Foo.countGreaterThan(Strings, "a");
    assertEquals(4, actual);
  
  }


}