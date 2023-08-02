public class ThisKeyword {

    static class MyClass{

        int value;
        
        public MyClass(int value){
            this.value=value;
        }

        public void DoSomething(){
            printvalue(this);                               //"this" is passed as the argument
        }
    }

    public static void printvalue(MyClass instance){
        System.out.println(instance.value);
    }

    public static void main(String[] args) {
        
        MyClass M= new MyClass(45);
        MyClass N= new MyClass(65);

        M.DoSomething();
        N.DoSomething();
    }
}
