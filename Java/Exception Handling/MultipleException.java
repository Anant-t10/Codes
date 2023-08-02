public class MultipleException {
    
    public static void main(String[] args) {
        
        int a= 100;
        int x=0;

        try{
            System.out.println(a/x);
        }catch(ArrayIndexOutOfBoundsException AI){
            System.out.println(AI);
        }catch(ArithmeticException AE){
            System.out.println(AE);
        }
    }
}
