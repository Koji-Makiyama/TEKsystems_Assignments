package BankingProject;

public class Manager extends Employee {
	
	//fields
	private String timeCards;

	public Manager() {
	}
	
	public Manager(String firstName, String lastName, long empl_id, String jobTitle, String timeCards) {
		super(firstName, lastName, empl_id, jobTitle); // WITHOUT THIS, printing firstName from Manager object will be Null.
		this.timeCards = timeCards;
	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}
	
	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}
	

}
