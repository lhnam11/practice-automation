package java_Class;

public class java_Inheritance {
	static class Vehicle {
		protected String brand = "Ford"; // thuộc tính của lớp cha

		public void honk() { // Phương thức của lớp java
			System.out.println("Tuut, tuu!");
		}
	}

	static class Car extends Vehicle {
		private String modelName = "Mustang";

		public static void main(String[] args) {
			Car myCar = new Car();
			myCar.honk();
			System.out.println(myCar.brand + " " + myCar.modelName);
		}
	}
}
