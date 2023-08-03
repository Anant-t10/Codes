import java.util.ArrayList;
import java.util.Collection;

public class CovertToArray {
    
    public static void main(String[] args) {
        
        Collection<String> c= new ArrayList<String>();

        c.add("Messi is");
        c.add("the greatest");
        c.add("Footballer");
        c.add("of all time.");

        System.out.println("-----------------------------------------");
        System.out.println("Printing the ArrayList as it is.:");
        System.out.println(c);
        System.out.println("-------------------------------------------");
        System.out.println("converted into Array:-");

        Object[] thearray= c.toArray();

        for(Object element: thearray){
            System.out.print(element+ " ");
        }
        System.out.println(" \n-------------------------------------------");

    }
}
