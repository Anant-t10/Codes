public class Names {
    
    static class MyThread extends Thread{

        public void run(){
            System.out.println("running.....");
        }
    }

    public static void main(String[] args) {
        
        MyThread t1= new MyThread();
        MyThread t2= new MyThread();

        System.out.println("the name of thread 1 is "+t1.getName());    //name returned using getName() 
        System.out.println("the name of thread 2 is "+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Anant Trimbakey");
        System.out.println("the name of thread 1 is "+t1.getName());    //name changed using setName()
    }
}
