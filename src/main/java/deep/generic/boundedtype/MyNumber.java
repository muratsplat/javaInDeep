package deep.generic.boundedtype;


// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html

public class MyNumber<T extends Integer> {
  private T n;

  public MyNumber(T n)  { this.n = n; }
  public boolean isEven() {
      return n.intValue() % 2 == 0;
  }
}