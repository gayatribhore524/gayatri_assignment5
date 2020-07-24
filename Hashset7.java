import java.util.*; 
  
public class Hashset7{ 
public static void main(String args[])
{
  HashSet<Integer> hSetNumbers = new HashSet<Integer>();
 
hSetNumbers.add(10);
hSetNumbers.add(20);
hSetNumbers.add(30);
hSetNumbers.add(40);
hSetNumbers.add(50);
 
System.out.println("HashSet contains: " + hSetNumbers);
 
int currentIndex = 0;
for(Integer element : hSetNumbers){
    
    if(currentIndex == 1){
        System.out.println("Element at index 1 is: " + element);
        break;
    }
    
    currentIndex++;
}
}
}