public class FinalVariableExample {
    
    static class Bike{
        
        final int  speedLimit= 70;

        void run(){
            this.speedLimit=100;
        }
    }

    public static void main(String[] args) {
        
        Bike kzr= new Bike();
        kzr.run();
    }
}
