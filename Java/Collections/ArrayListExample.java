import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList nongeneric = new ArrayList();

        nongeneric.add("My");
        nongeneric.add(45);
        nongeneric.add("is");
        nongeneric.add(true);

        System.out.println("\n===========================================");
        System.out.println("ArrayList with non genric type: ");
        for (int i = 0; i < nongeneric.size(); i++) {
            System.out.print(nongeneric.get(i));
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 10; i <= 100; i += 10) {
            numbers.add(i);
        }
        System.out.println("\n===========================================");
        System.out.println("The Generic type (Integer) ArrayList: ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println("\n===========================================");
        System.out.println("Removing 50 using remove()");
        numbers.remove(4);
        for (int element : numbers) {
            System.out.print(element + " ");
        }   
        System.out.println("\n===========================================");
        System.out.println("Set method");
        numbers.set(6,9999999);
        numbers.set(2, 999999999);
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        numbers.set(1, 45621);
        System.out.println("\n===========================================");
        System.out.println("Lets sort the ArrayList");
        numbers.sort(null);
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println("\n===========================================");
        System.out.println("We can iterate ArrayList in reverse order using ListIterator");
       
        ListIterator rollList= numbers.listIterator(numbers.size());
       while(rollList.hasPrevious()){
        System.out.print(rollList.previous()+ " ");                 //Used listIterator method to print in reverse
       }
    
        // Integer[] integerArray = numbers.toArray(new Integer[numbers.size()])
    }
}
