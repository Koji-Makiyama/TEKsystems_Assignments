package AssignmentOfOOPs;

public class FireMonster implements Monster {
    String name = "FireMonster";
    public String attack() {
    	return "FireMonster attacks!";
    }
    public FireMonster(String name) {
    	    this.name = name;
    }
}
