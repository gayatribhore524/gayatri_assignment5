import java.util.*;
public class LinkedList19
{
public static void main(String[] args) 
{
 LinkedList<String> list = new LinkedList<String>();
list.add("java");
list.add("python");
list.add("javascript");
list.add("html");
System.out.println("LinkedList:" + list);
System.out.println();
list.add(1,"Element");
System.out.println("Linked List after adding element:" + list);
System.out.println();
 list.add("html");
System.out.println("Linked List:" + list);
System.out.println();
  Object[] objects = list.toArray(); 
  for (Object obj : objects) 
   System.out.print(obj + " "); 
System.out.println();
  System.out.println("List contains 'Android':" + list.contains("css"));
System.out.println();

  
System.out.println("linked List size:" + list.size());
System.out.println();
  System.out.println(" list:" + list.remove("java"));
System.out.println();
 System.out.println("Last Index of list: " + list.lastIndexOf("javascript"));
System.out.println();
 LinkedList<String> list1 = new LinkedList<String>(); 
  
   
      list1.add("book"); 
      list1.add("notebook"); 
      list1.add("pen"); 
    
      
      LinkedList<String> list2 = new LinkedList<String>(); 
      list2.add("desk"); 
      list2.add("table"); 
      list2.add("chair"); 
    
   
      System.out.println("The LinkedList is: " + list2); 
              
   
      list1.addAll(list2); 
System.out.println("adding two lnkedlist="+list1);
System.out.println();
   System.out.println("The new linked list is: " + list1); 
System.out.println();
 List<String> list3 = list1.subList(1, 2);
        System.out.println("Sub List: "+list3);
System.out.println();
    list2.remove(1); 
System.out.println();
  
        System.out.println("Final LinkedList:" + list2); 
System.out.println();
  list1.clear();

  System.out.println("Linked List:" + list1);
System.out.println();
  
 



 }

}