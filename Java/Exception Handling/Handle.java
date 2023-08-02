public class Handle{

    public static void main(String[] args) {
        
        int x= 100;

        try {
            System.out.println(100/0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The rest of the code.");
    }
}