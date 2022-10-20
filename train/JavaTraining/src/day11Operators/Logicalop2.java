package day11Operators;

public class Logicalop2 {
	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1=20,num2=30;
		boolean bool1=(num1==num2);//f
		boolean bool2=(num1>num2);//f
		
		// Logical AND
		System.out.println("bool1 && bool2 = " + (bool1 && bool2));//

		// Logical OR
		System.out.println("bool1 || bool2 = " + (bool1 || bool2)); // 

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));//

	}
}