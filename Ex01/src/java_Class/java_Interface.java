package java_Class;

class Ca implements Vehi {
	@Override
	public void startEngine() {
		System.out.println("Car engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car engine stopped");
	}
}

public class java_Interface {
	public static void main(String[] args) {
		Vehi myCar = new Ca();
		myCar.startEngine();
		myCar.stopEngine();
	}

}
