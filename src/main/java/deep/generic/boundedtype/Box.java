package deep.generic.boundedtype;

// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html

public class Box<T> {

  private T t;

  /**
   * @param t the t to set
   */
  public void setT(T t) {
    this.t = t;
  }

  /**
   * @return the t
   */
  public T getT() {
    return t;
  }

  public <U extends Number> String inspect(U u) {
    return String.format("T:%s,U:%s", t.getClass().getName(), u.getClass().getName());
  }

}