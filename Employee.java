package Opps;
public class Employee {
    private int id;
    private String name;
    private double salary;
   

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
       
    }

    public double raiseSalary(double percent) {
    	
        double raiseAmount = salary * percent / 100;
        return salary += raiseAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

 
	}



