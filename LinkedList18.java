import java.util.LinkedList;
 
public class LinkedList18 {
 
  public static void main(String[] args) {
 
    LinkedList<String> List = new LinkedList<String>();
   
    List.add("laptop");
    List.add("smartphone");
    List.add("telephone");
  
   
    System.out.println("LinkedList contains : " + List);
    
     List.add(1, "computer");
     System.out.println("After inserting 10 LinkedList contains : " + List);
    
    
  }
}