import java.util.*; 
  
class Hashset1 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> hash= new HashSet<String>(); 
  
      
        hash.add("photo"); 
        hash.add("video"); 
        hash.add("glf"); 
     
        Iterator<String> i = hash.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    } 
} 