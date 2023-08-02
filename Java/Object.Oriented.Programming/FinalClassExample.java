public class FinalClassExample {
    
    static class One{
        One(){
           System.out.println("One constructor"); 
        }
    }
    static class Second extends One{
        Second(){
           System.out.println("Second constructor"); 
        }
    }
    final static class Third extends Second{
        Third(){
           System.out.println("Third constructor"); 
        }
    }
    static class Fourth extends Third {          //this class cannot be inherited because the 
        Fourth(){                               //Third class in decorated with final keyword 
           System.out.println("Fourth constructor"); 
        }
    }
    public static void main(String[] args) {
        
        One o= new One();
        System.out.println("---------------------");       //Parent class constructor are called everytime
        Second s= new Second();                              // one->second
        System.out.println("---------------------");
        Third t= new Third();                               //one->second->third
       // Fourth f= new Fourth();
    }
}
