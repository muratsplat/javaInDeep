package deep.generic.subtyping;

import java.util.ArrayList;
import java.util.HashMap;

public class MyList<E,P> extends ArrayList<E>  implements PayloadList<E,P> {

  private HashMap<Integer,P> p  = new HashMap<>();

  public void setPayload(int idx, P val) {
    this.p.put(idx, val);
  }

  public P getPayload(int idx) {
    return this.p.get(idx);
  }

}