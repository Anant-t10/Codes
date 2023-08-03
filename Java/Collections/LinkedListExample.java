import java.util.*;

public class LinkedListExample {
    
    public static void main(String[] args) {
        
        String[] arr= {"I", "am", "Batman!", "Why", "so", "serious?"};
        LinkedList<String> mylist= new LinkedList<String>(Arrays.asList(arr)); //arrays converted as linked list directly

        System.out.println("===============================================");
        Iterator<String> roll= mylist.iterator();
        System.out.println("Printing Linked List");
        while(roll.hasNext()){
            System.out.print(roll.next()+" ");
        }
        


    }
}
