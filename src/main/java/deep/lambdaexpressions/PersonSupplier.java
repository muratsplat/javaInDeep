package deep.lambdaexpressions;

import java.util.Collection;
import com.google.common.base.Supplier;

public class PersonSupplier  {
  public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
    SOURCE sourceCollection,
    Supplier<DEST> collectionFactory) {
    
    DEST result = collectionFactory.get();
    for (T t : sourceCollection) {
        result.add(t);
    }
    return result;
  }
}