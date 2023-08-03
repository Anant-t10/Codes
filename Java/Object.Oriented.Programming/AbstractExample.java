abstract class Template{
    abstract void print();
}

class One extends Template{
    void print(){
        System.out.println("Printed from one");
    }
}

public class AbstractExample {
    
    public static void main(String[] args) {
        One ob= new One();
        ob.print();  
    }
}
