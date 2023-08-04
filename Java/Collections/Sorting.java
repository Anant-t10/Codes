import java.util.*;

public class Sorting {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al= new ArrayList<Integer>();

        al.add(56);
        al.add(21);
        al.add(36);
        al.add(78);
        al.add(10);

        Collections.sort(al);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }
}
