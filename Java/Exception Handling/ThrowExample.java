public class ThrowExample {
    
    public static void validate(int age){

        if(age<18){
            throw new ArithmeticException("Age is lesser than 18");
        }else{
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        validate(15);
    }
}
