package Opps;

public class EmployeeTest {

	public static void main(String[] args) {
		// create a employee object
		Employee employee1= new Employee(101,"Ajay",60000);
		
		
		// access instance variable using getter method
		int id1= employee1.getId();
		String name1= employee1.getName();
		double salary1= employee1.getSalary();
		double raisesalary1= employee1. raiseSalary(15);
        System.out.println("Id: "+ id1);

        System.out.println("Name:" + name1);
        System.out.println("Salary:"+ salary1);
        
      
      
	System.out.println("RaiseSalary:"+ raisesalary1);
//        System.out.println("----------------");
//        employee1.displayInfo();
        
	}

}
