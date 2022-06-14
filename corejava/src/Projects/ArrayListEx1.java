package Projects;
import java.util.ArrayList; 
import java.util.List; 
public class ArrayListEx1 
{ 
public static void main(String[] args) 
{ 
 
   List<String> list = new ArrayList<String>(); 
 
    System.out.println("Adding elements to end of list"); 
   
    list.add("A"); 
    list.add("B"); 
    list.add("D"); 
    list.add("E"); 
    list.add("G"); 
   
System.out.println("ArrayList insertion order: " +list); 
   
System.out.println("Adding an element at a specific index after B element."); 
   list.add(2, "C"); 
System.out.println("ArrayList insertion order after adding C: " +list ); 

System.out.println("Adding an element at a specific index after E"); 
   list.add(5, "F"); 
System.out.println("ArrayList insertion order after adding F: " +list); 
 } 
}


