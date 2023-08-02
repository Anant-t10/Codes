public class UserDefinedExample {
    
    static class CustomException extends Exception{

        public CustomException(String str){
            super(str);
        }
    }

    public static void main(String[] args) {
        
        try{
            throw new CustomException("This is User Defined Exception.");
        }catch(CustomException c){
            System.out.println("Caught the Exception.");
            System.out.println(c.getMessage());
        }
    }
}
