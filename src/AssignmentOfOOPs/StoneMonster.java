package AssignmentOfOOPs;

public class StoneMonster implements Monster {
    String name = "StoneMonster";
    public String attack() {
    	return "StoneMonster attacks!";
    }
    public StoneMonster(String name) {
    	    this.name = name;
    }
}
