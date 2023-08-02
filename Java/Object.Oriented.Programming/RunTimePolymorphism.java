class Computer{
    void whoAmI(){
        System.out.println("I am Computer.");
    }
}
class Laptop extends Computer{
    @Override
    void whoAmI(){
        System.out.println("I am Laptop.");
    }
}
class Mobile extends Laptop{
    @Override
    void whoAmI(){
        System.out.println("I am Mobile.");
    }
}
public class RunTimePolymorphism {
                                                            
    public static void main(String[] args) {
        
        Computer oldie= new Computer();
        oldie.whoAmI();
        System.out.println("-------------------------------------");
        Laptop hp= new Laptop();
        hp.whoAmI();
        System.out.println("-------------------------------------");
        System.out.println("Changing the object of the refrence of type Laptop:=");
        hp= new Mobile();                       //refrence is of type Laptop but the object is of the type Mobile.
        hp.whoAmI();                            // Jvm decide whose mthod to call during the runtime
        System.out.println("-------------------------------------");
    }
}
