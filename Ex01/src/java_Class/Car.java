package java_Class;

public class Car extends Vehicle {
	private String modelName = "tu tu tu";

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}
