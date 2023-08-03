import java.util.*;

public class TreeSetExample {
    
    public static void main(String[] args) {
        
        TreeSet ts= new TreeSet();
        ts.add(50);
        ts.add(70);
        ts.add(90);
        ts.add(40);
        ts.add(20);
        ts.add(10);
        ts.add(30);

        Iterator roll= ts.iterator();                       //iterated using Iterator
        while(roll.hasNext()){
            System.out.print(roll.next()+ " ");
        }
        System.out.println("\nCieling to 45:");
        System.out.println(ts.ceiling(45));

        System.out.println("\nLower to 45:");
        System.out.println(ts.floor(45));
    }
}
