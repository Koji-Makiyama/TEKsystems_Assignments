package BankingProject;

public class Employee {
	
	String firstName;
	String lastName;
	long empl_id;
	String jobTitle;

	
	Employee() {
	}
	
	public Employee(String firstName, String lastName, long empl_id, String jobTitle) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
		this.jobTitle = jobTitle;
	}
	
	public Employee(String firstName, String lastName, long empl_id) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
	}
	
	public Employee(String firstName, long empl_id) {
		// super();
		this.firstName = firstName;
		this.empl_id = empl_id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getEmpl_id() {
		return empl_id;
	}
	public void setEmpl_id(long empl_id) {
		this.empl_id = empl_id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empl_id=" + empl_id + ", jobTitle="
				+ jobTitle + "]";
	}

	
	
}
