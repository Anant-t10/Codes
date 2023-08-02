public class ThreadingusingRunnable {
    
    static class MyThread implements Runnable{

        public void run(){
            System.out.println("My thread is running through runnable interface.");
        }
    }

    public static void main(String[] args) {
        
        MyThread t1= new MyThread();

        Thread tx= new Thread(t1);

        tx.start();
    }
}
