public class ControlConstructor {

    static class Parent{

        Parent(){
            System.out.println("this is parent constructor.");
        }
        Parent(int i){
            System.out.println("this is parent class constructor- "+i);
        }
    }   
    static class Child extends Parent{

        Child(){
            super();                                              // We controlled which constructor should JVM calls.
            System.out.println("this is Child constructor.");   //  using super()
        }
        Child(int i){
            super(i);
            System.out.println("this is parent class constructor- "+i);
        }
    }

    public static void main(String[] args) {
        
        Child C= new Child();
        Child B= new Child(45);
    }
}
