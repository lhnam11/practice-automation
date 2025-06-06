package java_Class;

public class java_ClassMethods {
	// tạo và gọi phương thức tĩnh (static method)
	static void myMethod() {
		System.out.println("Hello world!");
	}

	// phân biệt static và public
	static void myStaticMethod() {
		System.out.println("1. Gọi mà không cần tạo đối tượng");
	}

	public void myPublictMethod() {
		System.out.println("\n2. Cần tạo đối tượng để gọi");
	}
    // Using multiple classes
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can");
	}
	
	public void speed(int maxSpeed)
	{
		System.out.println("Max speed is: " + maxSpeed);
	}
	
	public static void main(String[] args) {
		myStaticMethod();// gọi trực tiếp
		java_ClassMethods myObj = new java_ClassMethods();
		myObj.myPublictMethod();
		myMethod();
		java_ClassMethods myCar = new java_ClassMethods();
		myCar.fullThrottle();
		myCar.speed(200);
	}

}
