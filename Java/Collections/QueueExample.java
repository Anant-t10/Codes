import java.util.*;

public class QueueExample {
    
    public static void main(String[] args) {
        
        PriorityQueue queue= new PriorityQueue<>();

        queue.add(45);
        queue.add(21);
        queue.add(36);
        queue.add(78);
        queue.add(96);
        System.out.println("====================================");
        System.out.println("Ques is: ");
        for(Object element: queue){
            int number= (int) element;
            System.out.print(number+ " "); 
        }

        System.out.println("\n====================================");
        System.out.println("removing head:");
        int head= (int)queue.remove();
        System.out.print("now: ");
        for(Object element: queue){
            int number= (int) element;
            System.out.print(number+ " "); 
        }

        System.out.println("\n====================================");
        System.out.println("Peek Method");
        System.out.println("Peeking head:"+ queue.peek());
        System.out.println("====================================");

    }
}
