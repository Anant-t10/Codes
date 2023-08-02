public class Finally {
    
    public static void main(String[] args) {
        
        int a=50;
        try{
            a=50/0;
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException AB){
            System.out.println(AB);
        }
        finally{
            System.out.println("Finally block is always executed.");
        }
    }
}
