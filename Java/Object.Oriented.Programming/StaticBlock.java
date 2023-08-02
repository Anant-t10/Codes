public class StaticBlock {
    
    static{
        System.out.println("This is Static Method");      //static block is implemented whenever the class
    }                                                       //is loaded in the class loader. Therefore it runs.   

    public static void main(String[] args) {

      //  StaticBlock block= new StaticBlock();
    }
}
