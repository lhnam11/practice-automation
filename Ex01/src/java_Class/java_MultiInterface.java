package java_Class;

interface FirstInterFace{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterFace,SecondInterface{
	@Override
	public void myMethod() {
		System.out.println("txt....1");
		
	}
	@Override
	public void myOtherMethod() {
		System.out.println("txt....2");	
	}
}
public class java_MultiInterface {
	public static void main(String[] args) {
		DemoClass myObj1 = new DemoClass();
		myObj1.myMethod();
		myObj1.myOtherMethod();
	}

}
