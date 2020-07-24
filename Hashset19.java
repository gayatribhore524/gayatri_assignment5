import java.util.*; 
  
class Hashset19 
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
System.out.println();

 System.out.println("The size of the set is: " + hash.size()); 
System.out.println();

   
        boolean result = hash.isEmpty();

       System.out.println();

        System.out.println("hashset isEmpty(): " + result);
System.out.println();

   System.out.println("HashSet: " + hash); 
  
      System.out.println();

        System.out.println("hashset: " + hash.contains("java")); 
System.out.println();

 HashSet<Integer> hSetNumbers = new HashSet<Integer>();
 
hSetNumbers.add(10);
hSetNumbers.add(20);
hSetNumbers.add(30);
hSetNumbers.add(40);
hSetNumbers.add(50);
 
System.out.println("HashSet contains: " + hSetNumbers);
System.out.println();

 
int currentIndex = 0;
for(Integer element : hSetNumbers){
    
    if(currentIndex == 1){
        System.out.println("Element at index 1 is: " + element);
        break;
    }
    
    currentIndex++;
}
System.out.println();

             Object[] objects =hash.toArray(); 
  
        for (Object obj : objects) 
            System.out.print(obj + " "); 
System.out.println();

   hash.remove(2); 
       
       
        System.out.println("HashSet after removing elements: " + hash); 
 System.out.println();

        HashSet<String> hash1 = new HashSet<>();
        
        hash1.add("hello");
        hash1.add("by");
      
        hash1.add("Hi");
        
        System.out.println("hashset = " + hash1);
        System.out.println();

       
        HashSet<String> hash2= new HashSet<>();
       
       
        hash2.add("black");
        hash2.add("white");
    
        System.out.println("hash2 = " + hash2);
       System.out.println();

        boolean bResult = hash1.addAll(hash2);
  
      
        
        System.out.println("hashset = " +hash1);
 hash1.add("java");
       
        
        System.out.println("hashset = " + hash1);
   hash.clear(); 
  
      System.out.println();

        System.out.println("hashset: " +hash); 

    } 
} 