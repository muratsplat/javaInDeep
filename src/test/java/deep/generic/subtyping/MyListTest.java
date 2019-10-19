package deep.generic.subtyping;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

import org.junit.Test;


public class MyListTest {


  @Test public void simple() {

    PayloadList<Integer,String> fooList = new MyList<>();

    fooList.add(1);
    fooList.add(2);

    fooList.setPayload(0, "Foo");

    assertEquals(new Integer(1), fooList.stream().sorted().findFirst().get());
    assertEquals(3, fooList.stream().mapToInt(Integer::intValue).sum());
    assertEquals("Foo", fooList.getPayload(0));

    PayloadList<String,Integer> barList = new MyList<>();

    barList.add("8");
    barList.add("2");
    barList.setPayload(0, 99);

    assertEquals("2", barList.stream().sorted().findFirst().get());
    assertEquals(10, barList.stream().map(new Function<String,Integer>() {
      @Override
      public Integer apply(String t) {
        return Integer.parseInt(t);
      }
    }).mapToInt(Integer::intValue).sum());
    // the version of lambda 
    assertEquals(10, barList.stream().map(s -> Integer.parseInt(s)).mapToInt(Integer::intValue).sum());
    assertEquals(new Integer(99), barList.getPayload(0));
  }

}

