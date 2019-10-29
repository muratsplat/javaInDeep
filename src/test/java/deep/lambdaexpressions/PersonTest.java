package deep.lambdaexpressions;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Consumer;


import static org.junit.Assert.*;

public class PersonTest {

  @Test public void map() {
    List<Person>  list =  Arrays.asList(new Person("John", Person.Sex.MALE), new Person("Mahmut", Person.Sex.MALE));
    List<String> listMap = list.stream().map(p -> p.toString()).collect(Collectors.toList());

    assertEquals(
      Arrays.asList("Person[Name: John, Age: 0, Gender: MALE]", "Person[Name: Mahmut, Age: 0, Gender: MALE]"), 
      listMap
    );
  }

  @Test public void filter() {
    List<Person>  list =  Arrays.asList(new Person("Alice", Person.Sex.FEMALE), new Person("Mahmut", Person.Sex.MALE));
    List<Person> filter = list.stream().filter(p -> p.getGender() == Person.Sex.FEMALE).collect(Collectors.toList());

    assertEquals(
      list.get(0), 
      filter.get(0)
    );
  }


  @Test public void consumerExample() {
    final Integer change = 0;
    Consumer<Integer>  consumer =  (p) -> {Integer changeIn = p; p = change;};
    Integer x = 10;  
    consumer.accept(x);
    
    assertEquals(x, (Integer) 10);

  }

  @Test public void personMapString() {
    Person foo  = new Person("John", Person.Sex.MALE);
    PersonMapString<Person, String>  mymap =  p -> p.toString();
    String toSring = mymap.map(foo);
    assertEquals("Person[Name: John, Age: 0, Gender: MALE]", toSring);  
  }
  @Test public void sorting() {

    List<Person>  list =  Arrays.asList(
      new Person("John", Person.Sex.MALE, 13), 
      new Person("Mahmut", Person.Sex.MALE, 12),
      new Person("Sefket", Person.Sex.FEMALE, 34),
      new Person("Jesica", Person.Sex.FEMALE, 23)
    );

    List<Person>  listOneActual =  Arrays.asList(
      new Person("Mahmut", Person.Sex.MALE, 12),
      new Person("John", Person.Sex.MALE, 13), 
      new Person("Jesica", Person.Sex.FEMALE, 23),
      new Person("Sefket", Person.Sex.FEMALE, 34)
    );

    List<Person> sortedOne = list.stream().sorted((Person a, Person b) -> {
      return a.getBirthday().compareTo(b.getBirthday());
    }).collect(Collectors.toList());
    assertEquals(listOneActual, sortedOne);

    List<Person> sortedTwo = list.stream().sorted(new PersonAgeComparator()).collect(Collectors.toList());
    assertEquals(listOneActual, sortedTwo);

    List<Person> sortedThree = list.stream().sorted(Person::compareByAge).collect(Collectors.toList());
    assertEquals(listOneActual, sortedThree);
  }
}