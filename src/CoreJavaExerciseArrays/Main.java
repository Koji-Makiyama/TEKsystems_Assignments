package CoreJavaExerciseArrays;
import java.util.Arrays;

public class Main {

	// Question 1.
	public static void main(String[] args) {
		int[] myArr1 = new int[3];
		myArr1[0] = 1;
		myArr1[1] = 2;
		myArr1[2] = 3;
		System.out.println(myArr1[0]);
		System.out.println(myArr1[1]);
		System.out.println(myArr1[2]);
		
    // Question 2.
		int[] myArr2 = new int[5];
		myArr2[0] = 13;
		myArr2[1] = 5;
		myArr2[2] = 7;
		myArr2[3] = 68;
		myArr2[4] = 2;
		System.out.println(myArr2[myArr2.length/2]);
		
	// Question 3.
	String[] myArr3 = { "red", "green", "blue", "yellow" };
	System.out.println(myArr3.length);
	String[] myClonedArr3 = myArr3.clone();
	System.out.println(Arrays.toString(myArr3));	
	System.out.println(Arrays.toString(myClonedArr3));
	
	// Question 4.
	int[] myArr4 = { 9, 8, 7, 6, 5 };
	System.out.println(myArr4[0]);
	System.out.println(myArr4[myArr4.length-1]);
	// System.out.println(myArr4[myArr4.length]); Exception: Index 5 out of bounds for length 5
	// myArr4[5] = 22; Exception: Index 5 out of bounds for length 5
	
	// Question 5.
	int[] myArr5 = new int[5];
	for (int i = 0; i < myArr5.length; i++) {
		myArr5[i] = i;
		System.out.println(myArr5[i]);
	    }
	System.out.println(Arrays.toString(myArr5));
	
	// Question 6
	int[] myArr6 = new int[5];
	for (int i = 0; i < myArr6.length; i++) {
		myArr6[i] = i * 2;
		System.out.println(myArr6[i]);
	    }
	System.out.println(Arrays.toString(myArr6));

	// Question 7
	Object[] myArr7 = { "first", "second", "third", "fourth", "fifth" };
	for (int i = 0; i < myArr7.length; i++) {
		if (i != 2) {
			System.out.println(myArr7[i]);
	  	    } 
		}
	
	// Question 8
	String[] myArr8 = { "1st", "2nd", "3rd", "4th", "5th" };
	String Arr8 = myArr8[0];
	myArr8[0] = myArr8[2];
	myArr8[2] = Arr8;
	System.out.println(Arrays.toString(myArr8));
	
	// Question 9
	int[] myArr9 = { 4, 2, 9, 13, 1, 0 };
	Arrays.sort(myArr9);
	System.out.println(Arrays.toString(myArr9));
	System.out.println(myArr9[0]);
	System.out.println(myArr9[myArr9.length-1]);
	
	// Question 10
	Object[] myArr10 = { 3, "one", "two", "three", 6.55d };
	System.out.println(Arrays.toString(myArr10));
	
	
	}
}
