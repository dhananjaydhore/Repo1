package Day8Methods;

public class Method02 {
	// static global variables
	static int age;
	static double salary;

	
	public static int test1() {
		System.out.println("I am test1 method.");
		// logic
		 int pin=201201;
		 return pin;
		//return 201201;
	}

	
	static void test2() {
		System.out.println("I am test2 method");
		// return; this will be written by java compiler at compile
	}

	
	static double test3(boolean b1) {
		System.out.println("");
		return 15.36;
	}

	
	static private void test4(float f) {
		System.out.println("");
	}

	public static void main(String[] args) {

	}

}
