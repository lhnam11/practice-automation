package java_Class;

public class java_Polymorphism {
	public static void main(String[] args) {
//		Animal myAnimal = new Animal();
//		Animal myPig = new Pig();
//		Animal myDog = new Dog();
//		
//		myAnimal.animalSound();
//		myPig.animalSound();
//		myDog.animalSound();
		
		Animal[] animals = {new Animal(), new Pig(), new Dog()};
	    for (Animal a : animals)
	    {
	    	a.animalSound();
	    }
	}
}

class Animal{
	public void animalSound() {
		System.out.println("The aniamal makes a sound");
	}
}
class Pig extends Animal{
	@Override
	public void animalSound() {
		System.out.println("The pig says: ủn ỉn");
	}
}
class Dog extends Animal{
	@Override
	public void animalSound() {
		System.out.println("The dog says: gâu gâu");
	}
}

