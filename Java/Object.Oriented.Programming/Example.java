public class Example {

    static class Company{

        public int noOfEmployees;
        public String Name;

        public Company(String name, int number){

            this.noOfEmployees= number;
            this.Name= name;
        }

        public void showDetails(){
            System.out.println("Name: "+ Name);
            System.out.println("Number of Employees: "+ noOfEmployees);
        }
    }    

    public static void main(String[] args) {
        
        Company mahindra= new Company("Mahindra Pvt Ltd", 1050);
        mahindra.showDetails();
    }
}
