import java.util.LinkedList;
public class LinkedList10{
   public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<String>();
      list.add("banana");
      list.add("mango");
      list.add("lotus");
      list.add("rose");
      
      System.out.println("The LinkedList is: " + list);
      list.set(3, "java");
      System.out.println("The LinkedList is: " + list);
   }
}