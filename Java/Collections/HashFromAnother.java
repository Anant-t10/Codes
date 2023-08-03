import java.util.*;

public class HashFromAnother {
    
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Ajay");  
        
        HashSet hs= new HashSet(list);
        
        for(Object element: hs){
            System.out.print(element+ " ");
        }
    }
}
