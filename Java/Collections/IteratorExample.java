import java.util.*;

public class IteratorExample {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al= new ArrayList<Integer>();
            
            al.add(45);
            al.add(52);
            al.add(74);
            al.add(0);
            al.add(79);
            al.add(0);
            al.add(100);
    
       Iterator<Integer> roll= al.iterator();           // Creating Iterator Object which holds Integer type obj

       while(roll.hasNext()){               
            
            int toPrint= roll.next();                   //using hasNext()
            System.out.print(toPrint+ " ");
            if(toPrint==0){
                roll.remove();                         //using remove() method
            }
       }
       System.out.println("\n Removed 0s using remove method: "+ al);
    }
}
