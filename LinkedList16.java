import java.util.LinkedList;
import java.util.List;
 
public class LinkedList16 {
 
    public static void main(String a[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
       
        arrl.add("good");
        arrl.add("better");
        arrl.add("best");
        arrl.add("poor");
      
        System.out.println("Actual LinkedList:"+arrl);
        List<String> list = arrl.subList(2, 3);
        System.out.println("Sub List: "+list);
    }
}