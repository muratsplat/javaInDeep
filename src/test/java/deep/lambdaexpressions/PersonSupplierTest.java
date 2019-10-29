package deep.lambdaexpressions;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import static org.junit.Assert.*;

public class PersonSupplierTest {

  @Test public void sorting() {

    List<Person>  list =  Arrays.asList(
      new Person("John", Person.Sex.MALE, 13), 
      new Person("Mahmut", Person.Sex.MALE, 12),
      new Person("Sefket", Person.Sex.FEMALE, 34),
      new Person("Jesica", Person.Sex.FEMALE, 23)
    );

    Set<Person> one = PersonSupplier.transferElements(list, HashSet::new);
    assertEquals(4, one.size());

    Queue<Person> two = PersonSupplier.transferElements(list, LinkedList<Person>::new);
    assertEquals(4, two.size());
  }
}