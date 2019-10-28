package deep.generic.bridgemethods;

import java.io.PrintStream;

public class Node<T> {
  public T data;

  public static PrintStream agent;
  
  public Node(T data) {
    this.data = data;
  }

  public void setData(T data) {
    if (Node.agent == null) {
      System.out.println("Node.setData");      
    } else {
      agent.println("Node.setData");
    }
    this.data = data;
  }
}