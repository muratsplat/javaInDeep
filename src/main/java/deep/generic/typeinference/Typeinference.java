package deep.generic.typeinference;

import java.util.List;
import deep.generic.boundedtype.Box;

public class Typeinference {

  public static <U> void addBox(U u, List<Box<U>> boxes) {
    Box<U> box = new Box<>();
    box.setT(u);
    boxes.add(box);
  }

  public static <U> String outputBoxes(List<Box<U>> boxes) {
    int counter = 0;
    String out = "";
    for (Box<U> box: boxes) {
      U boxContents = box.getT();
      out += String.format("%d,%s ",  counter, boxContents.toString());
      counter++;
    }
    return out.trim();
  }
}

  