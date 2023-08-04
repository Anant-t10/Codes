import java.util.*;

public class HashMapMethods {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm= new HashMap();     //creating the HashMap
        hm.put(1, "one");                       
        hm.put(2,"two");
        hm.put(3, "three");                 //adding the elements using put() method
        hm.put(4, "four");
        hm.put(5, "five");

        for(Map.Entry entry : hm.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
