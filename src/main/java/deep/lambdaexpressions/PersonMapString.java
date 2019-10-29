package deep.lambdaexpressions;


public interface PersonMapString <S extends Person, T> {
  public T map(S p);

}