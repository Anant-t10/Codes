public class ManyThreads {
    
    static class MyThread extends Thread{

        String s; 

        MyThread(String word){
            this.s= word;
        };

        public void start(){
            System.out.println("Hello "+s);
        }
    }

    public static void main(String[] args) {

        MyThread anant = new MyThread("anant");
        MyThread manan = new MyThread("Manan");

        for(int i=0; i<5; i++){
            anant.start();
            try{
                anant.sleep(900);               // Thread sleep method. we have to handle the exception! 
            }catch(Exception e){
                System.out.println(e);
            }
            manan.start();
        }
    }
}
