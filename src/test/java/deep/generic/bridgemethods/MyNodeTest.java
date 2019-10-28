package deep.generic.bridgemethods;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MyNodeTest {


  @Test public void simple() {
    MyNode mn = new MyNode(5);
    Node n = (MyNode)mn;       // A raw type - compiler throws an unchecked warning
    // n.setData("Hello"); // java.lang.ClassCastException at MyNodeTest.java:15
    Integer x = mn.data; // Causes a ClassCastException to be thrown.
  }


  @Test public void simple2() {
    MyNode mn = new MyNode(5);
    
    Node<Object> n = (Node)mn;       // A raw type - compiler throws an unchecked warning
    // n.setData("Hello"); // java.lang.ClassCastException at MyNodeTest.java:15
    // Integer x = n.data; // incompatible types: Object cannot be converted to Integer
                        // Integer x = n.data; // Causes a ClassCastException to be thrown.

    /*
     "Node n = mn;"  equals to "Node<Object> n = mn;"
    */                         
  }

  @Test public void simple3() {
    MyNode mn = new MyNode(5);
    Node<Integer> n = mn;       // A raw type - compiler throws an unchecked warning
    Integer x = n.data; // incompatible types: Object cannot be converted to Integer
  }
}