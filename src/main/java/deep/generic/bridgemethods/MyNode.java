package deep.generic.bridgemethods;

public class MyNode extends Node<Integer> {
  public MyNode(Integer data) { super(data);}
  public void setData(Integer data) {
    if (Node.agent == null) {
      System.out.println("MyNode.setData");      
    } else {
      MyNode.agent.println("MyNode.setData");
    }
    super.setData(data);
  }

}