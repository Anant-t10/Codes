public class PRogpogation {
    
    public static void first(){

        try{
            second();
        } catch(ArithmeticException AE){
            System.out.println(AE);
            System.out.println("Exception handeld at first method. That is at bottom of the call stack.");
        }
    }

    public static void second(){
        third();
    }

    public static void third(){
        int a= 50/0;
    }

    public static void main(String[] args) {
     
        first();
    }
}
