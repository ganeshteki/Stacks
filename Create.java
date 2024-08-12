
import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
Stack s = new Stack<>();
  // Load Values in Stack
  s.push(10);
  s.push(20);
  s.push(30);

  // Iterate it by usig Iterator and While Loops
  Iterator iterator = s.iterator();
  while (iterator.hasNext()) {
    System.out.println(iterator.next());
  }
}
}