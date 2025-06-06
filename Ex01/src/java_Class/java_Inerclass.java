package java_Class;

class OuterClass {
	int x = 10;

	// class InnerClass case 1  truy cập lớp trong 
	// có thể khai báo là private hoặc protected private classs InnerClass case 2 
	//static class InnerClass { //case 3 ( lớp bên trong là lớp tĩnh 
	class InnerClass{
		public int myInnerMethod()
		{
			return x;
		}
	//	int y = 5;
	}
}

public class java_Inerclass {
	public static void main(String[] args) {
		//OuterClass myOuter = new OuterClass();
		// OuterClass.InnerClass myInner = myOuter.new InnerClass(); // tạo 1 đối tượng
		// lớp bên ngoài, sau khi tạo đối tượng lớp bên trong
		// tượng lớp bên trong

		//case 3 OuterClass.InnerClass myInner = new OuterClass.InnerClass(); // khi dùng static cho lớp trong thì không cần tạo đối tượng của lớp bên ngoài
		//case 4: truy cập lớp ngoài từ lớp trong 
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.myInnerMethod());
		
		
	}
}
