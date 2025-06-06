package java_Class;

public class java_Modifiers {
	final int x = 10;
	final double PI = 3.14;

	public static void main(String[] args) {
		java_Modifiers myObj = new java_Modifiers();
//		myObj.x = 20; // will generate an error: can not assign a value to final varible
//		myObj.PI = 5;
		java_Encapsulation testObj = new java_Encapsulation();
//		testObj.name = "John"; // error
		testObj.setName("Lê Hoài Nam");
		System.out.println(testObj.getName());
		System.out.println(myObj.x);
	}
}
