public class Constructor {
    
    static class FirstClass{

        public FirstClass(){
            System.out.println("This is Parent class constructor.");
        }
    }
    static class SecondClass extends FirstClass{

        public SecondClass(){
            System.out.println("This is the Child class constructor.");
        }
    }

    public static void main(String[] args) {
        
        SecondClass child= new SecondClass();
    }
}
