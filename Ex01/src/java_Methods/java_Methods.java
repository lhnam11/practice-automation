package java_Methods;

public class java_Methods {
	static void myInformation() {
		System.out.println("Lê Hoài Nam - 20");
	}

	// Parameter biến nằm trong dấu (), argument giá trị thật được truyền vào phương
	// thức
	static void myParameters(String fname) {
		System.out.println(fname + " Refsnes");
	}

	static void mutilParameters(String name, int age) {
		System.out.println(name + " is " + age);
	}

	// method if else
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("You are not old enough");
		} else {
			System.out.println("You are enough");
		}
	}

	// Return Values
	static int myValues(int x) {
		return 5 + x;
	}

	static int totalTwoNumbers(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		myParameters("Nam");
		mutilParameters("Nam", 10);
		checkAge(10);
		System.out.println(myValues(3));
		int z = totalTwoNumbers(5, 3);
		System.out.println(z);
	}

}
