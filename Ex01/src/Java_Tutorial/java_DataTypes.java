package Java_Tutorial;

public class java_DataTypes {
	public static void main(String[] args) {
		// Java Data Types
		// Integer types
		// byte
		byte myNum = 100;
//			short myNum = 5000;
//			int myNum = 100000;
//			long myNum = 150000000L;
		System.out.println(myNum);
		Boolean Types;
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);

		int x = 5;
		int y = 6;
		boolean result = x < y;
		System.out.println(result);

		// Java Characters
		char myGrade = 'B';
		System.out.println(myGrade);
//			// ASCII
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);

		String greeting = "Hello world";
		System.out.println(greeting);

		// Real-life Example
		int items = 50;
		float costPerItem = 9.99f;
		float totalCost = items * costPerItem;
		char currency = '$';

		System.out.println("Number of items: " + items);
		System.out.println("Cost per item: " + costPerItem + currency);
		System.out.println("total cost = " + totalCost + currency);

		// Non-Primitive Data Types
		// example
		String name = "Alice";
		System.out.println(name.length());

		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers[0]);

//		    public class Student{
//		    	String name;
//		    	int age;
//		    }
//		    
//		    Student s = new Student();
//		    s.name = "John";
	}
}
