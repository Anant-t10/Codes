public class Example {

    static class Company{

        public int noOfEmployees;                                               //Properties of the Objects
        public String Name;

        public Company(){}

        public Company(String name, int number){                                //Constructor Created
            this.noOfEmployees= number;
            this.Name= name;
        }

        public void showDetails(){                                              //Method to access the properties
            System.out.println("Name: "+ Name);
            System.out.println("Number of Employees: "+ noOfEmployees);
        }
    }    

    static class Department extends Company{                                    //Child class inherited from Company Class

        public Department(String name, int number){
            this.Name= name;
            this.noOfEmployees= number;
            System.out.println("This is the " +this.Name +", which is inherited by Company");
        }

        public void showDetails(){
            System.out.println("The name of the Department is: "+ this.Name);       //Parent method used in the Child Class 
            System.out.println("The number of employees in the Department is: "+ this.noOfEmployees);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("=================================================================");

        Company mahindra= new Company("Mahindra Pvt Ltd", 1050);
        mahindra.showDetails();

        Department sales= new Department("Sales", 200);
        sales.showDetails();
        System.out.println("=================================================================");
    }
}
