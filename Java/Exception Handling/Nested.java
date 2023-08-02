public class Nested {  
  
    public static void main(String[] args) {  
          
        try  
        {  
        int data1=50/0; //may throw exception   
        }  
             // handling the exception  
        catch(Exception e)  
        {  
            // generating the exception in catch block  
        try{
            int data2=50/0;
        } catch(Exception f){
            System.out.println("Exception in second time.");
        }

        }  
    System.out.println("rest of the code");  
    }  
}  