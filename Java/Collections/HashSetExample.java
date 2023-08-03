import java.util.*;

public class HashSetExample {
    
    public static void main(String[] args) {
        
        HashSet hs= new HashSet();

        hs.add("one");
        hs.add("two");
        hs.add("one");              //Added duplicate value, will be ignored
        hs.add("three");
        hs.add("four");

        System.out.println("==================================================");
        System.out.println("Created One Two Three Four, but printed");
        
        for(Object element: hs){
            System.out.print(element+ " ");
        }

        System.out.println("\n==================================================");
        System.out.println("Removed 'three'");
        hs.remove("three");
        
        for(Object element: hs){
            System.out.print(element+ " ");
        }
        
        System.out.println("\n====================================================");
    }
}
