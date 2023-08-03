import java.util.HashSet;

public class CloneMethod {
    
    public static void main(String[] args) {
        
        HashSet hs= new HashSet();
        hs.add("one");
        hs.add("two");
        hs.add("one");              //Added duplicate value, will be ignored
        hs.add("three");
        hs.add("four");

        HashSet clonedSet = new HashSet();

        clonedSet= (HashSet) hs.clone();
        
        for(Object element: clonedSet){
            System.out.print(element+ " ");
        }
    }
}
