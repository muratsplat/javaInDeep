package deep.generic.boundedtypeparams;

// https://docs.oracle.com/javase/tutorial/java/generics/boundedTypeParams.html
public class Foo {

  public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray) {
      if (e.compareTo(elem) > 0) {
        ++count;
      }
    }
    return count;
  }
}


