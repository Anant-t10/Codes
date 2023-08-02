public class threading{

    static class MyThread extends Thread{           //using Thread class

        public void run(){
            System.out.println("My thread is running through thread class.");
        }
}
    public static void main(String[] args) {
        
        MyThread t1= new MyThread();
        t1.start();
    }
}