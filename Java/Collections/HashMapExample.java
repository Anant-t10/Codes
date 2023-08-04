import java.util.*;

public class HashMapExample {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm= new HashMap<Integer,String>();     //creating the HashMap
        hm.put(1, "one");                       
        hm.put(2,"two");
        hm.put(3, "three");                 //adding the elements using put() method
        hm.put(4, "four");
        hm.put(5, "five");

        hm.entrySet();

        Set set= hm.entrySet();                     //converting the Map into Set so that we can traverse

        Iterator roll= set.iterator();
        while(roll.hasNext()){                                  //Map.Entry is an Interface
            Map.Entry entry= (Map.Entry) roll.next();//<converted Object type into Map.Entry type to get Key and Value Seperately>
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
    }
}
