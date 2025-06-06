package Java_Tutorial;

public class java_Variables {
	public static void main(String[] args) {
		// java Variables

		int myNum = 5;
		float myFloatNum = 5.99f;// số thập phân
		char myLetter = 'D';// ký tự đơn
		boolean myBool = true; // giá trị logic như true, false
		String myText = "Lê Hoài Nam";
		System.out.println(myText);

		// java print Variables
		String name = "John";
		System.out.println("Hello " + name);
		String firstName = "Lê ";
		String LastName = "Hoài Nam";
		String fullName = firstName + LastName;
		System.out.println(fullName);
		
		float  x = 5.5f ;
		int   y = 6 ;
		System.out.println( y / x );
		
		//Java Declare Multiple Variables
//		int x  = 5;
//		int y  = 6;
//		float z  = 7.2f;
//		int x = 5, y = 6, z = 7;
//		int x,y,z;
		//x = y = z = 50;
//		System.out.println(x + y + z );
		
		//Java Identifiers
		
		int myVar = 10; // hợp lệ
		int my_var  = 20;// hợp lệ
		int $amount = 30; // hợp lệ
		int total123 = 40; //hợp lệ
	    
//		int 1number = 50; //Sai: không bắt đầu bằng số
//		int class = 60; //Sai: "Class" là từ khóa
//		int my var = 70; //Sai: không chứ dấu cách 
		
		int minutesPerhour = 60; //Good
		
		int m = 60;  // Ok, but not easy to  understand what m actually is
		
		// Java Variables – Ví dụ thực tế
		
		// Student Data
		String studentName = "Hoài Nam";
		int studentId = 15;
		int studentAge = 21;
		float studentFee = 75.25f;
		char studentGrade = 'A';
		// Print variables
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Age: " + studentAge);
		System.out.println("Student Fee: " + studentFee);
		System.out.println("Student Grade: " + studentGrade);
		//Calculate the Area of a Rectangle
		int length = 4;
		int width = 6;
		int area;
		
		area = length * width;
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
		System.out.println("Area of the retagngle is: " + area );
	}

	
}
