package CoreJavaExerciseControlFlow;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Question 1
		int x1 = 7;
		if (x1 < 10) {
			System.out.println("Less than 10");
		}
		x1 = 15;
		if (x1 < 10) {
			System.out.println("Less than 10"); // nothing is printed out.
		}
		
		// Question 2
		int x2 = 7;
		x2 = 50;
		if (x2 < 10) {
			System.out.println("Less than 10");
		} else if (x2 > 10) {
			System.out.println("Greater than 10");
		}
		
		// Question 3
		int x3 = 15;
		x3 = 50;
		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (x3 > 10 && x3 < 20) {
			System.out.println("Between 10 and 20");
		} else if (x3 >= 20) {
			System.out.println("Greater than or equal to 20");
		}
		
		// Question 4
		int x4 = 15;
		x4 = 5;
		if (x4 < 10 || x4 > 20) {
			System.out.println("Out of range");
		} else {
				System.out.println("In range");
		} 
		
		// Question 5
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		sc.nextLine();
		// sc.close();
		if (answer >= 90 && answer <= 100) {
			System.out.println("A");
		} else if (answer >= 80 && answer <= 89) {
			System.out.println("B");
		} else if (answer >= 70 && answer <= 79) {
			System.out.println("C");
		} else if (answer >= 60 && answer <= 69) {
			System.out.println("D");
		} else if (answer < 60) {
			System.out.println("F");
		} else {
			System.out.println("Score out of range.");
		}

		// Question 6
		int answer2 = sc.nextInt();
        while (answer2 < 1 || answer2 > 8) {
        	answer2 = sc.nextInt();
        }
        switch (answer2) {
        	case 1:
        		System.out.println("Monday");
        		break;
        	case 2:
        		System.out.println("Tuesday");
        		break;
        	case 3:
        		System.out.println("Wednesday");
        		break;
        	case 4:
        		System.out.println("Thursday");
        		break;
        	case 5:
        		System.out.println("Friday");
        		break;
        	case 6:
        		System.out.println("Saturday");
        		break;
        	case 7:
        		System.out.println("Sunday");
        		break;
        }
        sc.close();
	}

}
