import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
    
    public static void MyException() throws FileNotFoundException{

        FileReader File= new FileReader("C:\\Users\\Manan\\Desktop\\abc.txt");
        BufferedReader read= new BufferedReader(File);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        
        try{
            MyException();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
