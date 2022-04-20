package BankingProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello from WEDNESDAY, 04/20/2022" + " project.");
        
        Employee emp1 = new Employee("John", "Smith", 12345, "Sales");
        Employee emp2 = new Employee("Jane", "Smith", 54321, "Sales");
        Employee emp3 = new Employee("Francene", 3298);
        Manager manager1 = new Manager("Candice", "Smith", 4533, "Manager", "Sales TimeCard");
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(manager1);
        System.out.println(manager1.getFirstName());
        
	}

}
