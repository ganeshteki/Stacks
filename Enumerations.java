import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
  

   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration

  // print the values by using while Loop

  


    public static void main(String[] args) {

        Stack<Person> s = new Stack<>();

        s.push(new Person("pavani", 22));
        s.push(new Person("ganesh", 22));
        s.push(new Person("ramya", 18));

        Enumeration<Person> enumeration = s.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
  }
    class Person {
      String name;
      int age;

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      public String toString() {
          return name + "  " + age;
      }
  }