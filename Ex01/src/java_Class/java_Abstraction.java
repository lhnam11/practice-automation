package java_Class;

//Lớp trừu tượng 
abstract class Animals {
	public abstract void animalSound();// phương thức trừu tượng

	public void sleep() // phương thức thường
	{
		System.out.println("Zzz");
	}
}

// Lớp con kế thừa lớp Animal
class Pigs extends Animals {
	@Override
	public void animalSound() {
		System.out.println("Thi pig says: ủn ỉn");
	}
}
// mình dính phải lỗi vì trong project mình tồn tại pig và animal 

public class java_Abstraction {
	public static void main(String[] args) {
		Pigs myPigs = new Pigs();
		myPigs.animalSound();
		myPigs.sleep();
	}
}
