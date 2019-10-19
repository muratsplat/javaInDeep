package deep.generic.subtyping;

import java.util.List;

public interface PayloadList<E, P> extends List<E> {
  public void setPayload(int idx, P val);
  public P getPayload(int idx);

}