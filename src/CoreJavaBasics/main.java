package CoreJavaBasics;

public class main {

	public static void main(String[] args) {
    // Question or bullet # 1
    int myInt1 = 5;
    int myInt2 = 7;
    int myInt3 = myInt1 + myInt2;
    System.out.println(myInt3);
    
    // Question or bullet # 2
    double myDoub1 = 5.5;
    double myDoub2 = 7.7;
    double myDoub3 = myDoub1 + myDoub2;
    System.out.println(myDoub3);
    
    // Question or bullet # 3
    int myInt4 = 30;
    double myDoub4 = 50.5;
    double myDoub5 = myInt4 + myDoub4;
    // int myIntz = myInt4 + myDoub4; Exception cannot convert from double to int.
    System.out.println(myDoub5);
    System.out.println("(The variable must be a double.)");
    
    // Question or bullet # 4
    int myInt5 = 22;
    // int myInt6 = 32.5; Exception, int cannot have decimals, they must be whole numbers.
    double myInt6 = 32.5;
    double myDoub6 = myInt6 / myInt5;
    System.out.println(myDoub6);
    System.out.println("(The int has to change to a float or double to allow decimals.)");
    
    // Question or bullet # 5
    double myDoub7 = 6.6;
    double myDoub8 = 3.3;
    double myDoub9 = myDoub7/myDoub8;
    System.out.println(myDoub9);
    int myInt7 = (int)myDoub9;
    System.out.println(myInt7);
    
    // Question or bullet # 6
    int x = 5;
    int y = 6;
    int q = y/x;
    System.out.println(q);
    double q2 = q;
    System.out.println(q2);
    
    // Question or bullet # 7
    final int myConst = 24;
    System.out.println(myConst * myConst + 1);
    
    // Question or bullet # 8
    Double cookie = 1.99;
    Double coffee = 2.49;
    Double tea = 1.99;
    Double subtotal;
    Double totalSale;
    subtotal = (cookie * 3) + (coffee * 4) + (tea * 2);
    final double SALES_TAX = 1.08;
    totalSale = subtotal * SALES_TAX;
    System.out.printf("Total sale: %.2f", (totalSale));
    
	}

}
