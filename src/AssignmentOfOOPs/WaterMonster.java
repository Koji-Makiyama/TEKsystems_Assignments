package AssignmentOfOOPs;

public class WaterMonster implements Monster {
    String name = "WaterMonster";
    public String attack() {
    	return "WaterMonster attacks!";
    }
    public WaterMonster(String name) {
    	    this.name = name;
    }
}
