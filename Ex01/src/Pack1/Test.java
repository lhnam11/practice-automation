package Pack1;

public class Test {
	public static void main(String[] args) {
        
//		System.out.println("Hello");
//		System.out.println("Lê Hoài Nam");
//		System.out.println(11);
//		System.out.println(11 + 11);
//
//		String name = "Nam";
//		System.out.print(name);
//
//		int MyNum = 15;
//		System.out.print(MyNum);

//		int MyNum = 15;
//		MyNum = 20;
//		System.out.println(MyNum);

//		final int myNum = 15;
//		myNum = 20;// nếu đã final thì không thể thay đổi biến đ
//		System.out.println(myNum);
		// java Variables

//		int myNum = 5;
//		float myFloatNum = 5.99f;// số thập phân
//		char myLetter = 'D';// ký tự đơn
//		boolean myBool = true; // giá trị logic như true, false
//		String myText = "Lê Hoài Nam";
//		System.out.println(myText);

		// java print Variables
//		String name = "John";
//		System.out.println("Hello " + name);
//		String firstName = "Lê ";
//		String LastName = "Hoài Nam";
//		String fullName = firstName + LastName;
//		System.out.println(fullName);
//		
//		float  x = 5.5f ;
//		int   y = 6 ;
//		System.out.println( y / x );
		
		//Java Declare Multiple Variables
//		int x  = 5;
//		int y  = 6;
//		float z  = 7.2f;
//		int x = 5, y = 6, z = 7;
//		int x,y,z;
//		x = y = z = 50;
//		System.out.println(x + y + z );
		
		//Java Identifiers
		
//		int myVar = 10; // hợp lệ
//		int my_var  = 20;// hợp lệ
//		int $amount = 30; // hợp lệ
//		int total123 = 40; //hợp lệ
//	    
//		int 1number = 50; //Sai: không bắt đầu bằng số
//		int class = 60; //Sai: "Class" là từ khóa
//		int my var = 70; //Sai: không chứ dấu cách 
//		
//		int minutesPerhour = 60; //Good
//		
//		int m = 60;  // Ok, but not easy to  understand what m actually is
		
		// Java Variables – Ví dụ thực tế
		
		// Student Data
//		String studentName = "Hoài Nam";
//		int studentId = 15;
//		int studentAge = 21;
//		float studentFee = 75.25f;
//		char studentGrade = 'A';
//		// Print variables
//		System.out.println("Student Name: " + studentName);
//		System.out.println("Student Id: " + studentId);
//		System.out.println("Student Age: " + studentAge);
//		System.out.println("Student Fee: " + studentFee);
//		System.out.println("Student Grade: " + studentGrade);
//		//Calculate the Area of a Rectangle
//		int length = 4;
//		int width = 6;
//		int area;
//		
//		area = length * width;
//		System.out.println("Length is: " + length);
//		System.out.println("Width is: " + width);
//		System.out.println("Area of the retagngle is: " + area );
		
		//Java Data Types
		//Integer types
		//byte
//		byte myNum = 100;
//		short myNum = 5000;
//		int myNum = 100000;
//		long myNum = 150000000L;
//		System.out.println(myNum);
		//Boolean Types
//		boolean isJavaFun = true;
//		boolean isFishTasty = false;
//		System.out.println(isJavaFun);
//		System.out.println(isFishTasty);
//		
//		int x = 5; 
//		int y = 6;
//		boolean result  = x  <  y ;
//	    System.out.println(result);
		
		//Java Characters
//		char myGrade = 'B';
//		System.out.println(myGrade);
//		// ASCII
//		char myVar1 =  65, myVar2 = 66, myVar3=67;
//		System.out.println(myVar1);
//		System.out.println(myVar2);
//		System.out.println(myVar3);
//		
//		String greeting = "Hello world";
//		System.out.println(greeting);
		
		//Real-life Example
//		int items = 50;
//		float costPerItem = 9.99f;
//		float totalCost = items  * costPerItem;
//		char currency ='$';
//		
//		System.out.println("Number of items: " + items);
//		System.out.println("Cost per item: " + costPerItem + currency);
//		System.out.println("total cost = " + totalCost + currency);
		
		//Non-Primitive Data Types
		//example
//	    String name = "Alice";
//	    System.out.println(name.length());
//	    
//	    int[] numbers = {1,2,3};
//	    System.out.println(numbers[0]);
//	    
//	    public class Student{
//	    	String name;
//	    	int age;
//	    }
//	    
//	    Student s = new Student();
//	    s.name = "John";
		
		//Java Type Casting 
//		//1. Widening Casting( Tự động )
//		int myInt = 9;
//		double mydouble = myInt; // tự động ép kiểu int sang double
//		System.out.println(myInt);
//		System.out.println(mydouble);
//		
//		double MyDouble = 9.78;
//		int MyInt = (int) MyDouble; // ép kiểu thủ công 
//		System.out.println(MyDouble);
//		System.out.println(MyInt);
//		// Real-life example
//		int maxScore = 500;
//		int userScore = 423;
//		// ép kiểu userScore sang float để tính chính xác
//		float percentage = (float) userScore / maxScore * 100.0f;
//		System.out.println("User's percentage is " + percentage);
		
		//Java operators
//		
//		int x = 10;
//		int y = 5;
//		
//		// Toán tử số học
//		System.out.println(x + y);
//		System.out.println(x % y);
//		
//		//Toán tử so sánh
//		System.out.println(x > y);
//		
//		// Toán tử gán 
//		
//		x += 3;
//		System.out.println(x);
//		
//		// Toán tử logic
//		
//		System.out.println(x > y && x < 20);
		
		//Java String
//		String greeting = "Hello"; // Khai báo chuỗi
//		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println("Độ dài của chuỗi là: " + txt.length()); // Độ dài chuỗi
//		System.out.println(txt.toUpperCase()); //  in hoa
//		System.out.println(txt.toLowerCase()); // in thường
//		String text = "Please locate where 'locate' occurs!";
//		System.out.println(text.indexOf("where")); // Java đếm vị trí đầu từ 0 
//		
//	    System.out.println(text.charAt(14)); // Lấy ký tự ở vị trí cụ thể 
//	    
//	    String fullGreeting = greeting.concat(" " + text); // Nối chuỗi 
//	    System.out.println(fullGreeting);
//	    
//	    String a = "Java";
//	    String b = "java";
//	    System.out.println(a.equals(b)); // So sánh chuỗi phân biệt hoa thường
//	    
//	    System.out.println(a.equalsIgnoreCase(b)); // So sánh chuỗi không phân biệt hoa thường 
//	    
//	    String firstName = "Lê";
//	    String lastName = "Nam";
//	    System.out.println(firstName + " " + lastName);
	    
	    // Java Numbers and Strings
//	    int x = 10;
//	    int y = 20;
	    
//	    String x = "10";
//	    String y = "20";
//	    System.out.println(x + y);
//	    System.out.println(10 + 20 + "30"); // nếu x là chuối y là số thì sẽ chuyển y thành chuỗi nối vào x và ngược lại
//	    
//	    //Ký tự đặc biệt
//	    System.out.println("We are the so-called \"Vikings\" from the north");
//	    System.out.println("It's alright");
//	    System.out.println("The character \\ is called blacklash");
//	    System.out.println("Hello\nWorld");
//	    System.out.println("Name:\tJohn");
//				
		//Java maths
//	    System.out.println(Math.max(5,10));
//	    System.out.println(Math.min(5, 10));
//	    System.out.println(Math.sqrt(64));
//	    System.out.println(Math.abs(-4.7));
//	    System.out.println(Math.random());
//	    // ví dụ từ max đến min theo công thức
//	    System.out.println((int)(Math.random() * (100 - 50  + 1)) + 50);
	    
	    //Java Booleans - Kiểu dữ liệu logic
//	    Boolean isJavaFun = true;
//	    Boolean isFishTasty = false;
//	    
//	    System.out.println(isJavaFun);
//	    System.out.println(isFishTasty);
//	    
//	    int x = 10;
//	    int y = 9; 
//	    System.out.println(x > y);
//	    System.out.println(x == 10);
//	    System.out.println(10 == 15);
//	    
//	    int myAge = 18;
//	    int votingAge = 25;
//	    if(myAge >= votingAge)
//	    {
//	    	System.out.println("Old enough to vote");
//	    }
//	    else
//	    {
//	    	System.out.println("Not old enough to vote");
//	    }
//	    // có cách khai báo if
//	    int time = 20;
//	    String result = (time < 18) ? "Good day." :"Good evening.";
//	    System.out.println(result);
//	    
//	    // Real example
//	    int doorCode = 1337;
//	    if(doorCode == 1337) {
//	    	System.out.println("Correct code. The door is now open");
//	    }else {
//			System.out.println("Wrong code.The door remains closed.");
//		}
//	    
//	    //Java switch
//	    int day = 4;
//	    switch(day) {
//	    case 1:
//	    	System.out.println("Monday");
//	    	break;
//	    case 2:
//	        System.out.println("Tuesday");
//	        break;
//	      case 3:
//	        System.out.println("Wednesday");
//	        break;
//	      case 4:
//	        System.out.println("Thursday");
//	        break;
//	      case 5:
//	        System.out.println("Friday");
//	        break;
//	      case 6:
//	        System.out.println("Saturday");
//	        break;
//	      case 7:
//	        System.out.println("Sunday");
//	        break;
//	    }
//	    
//	    switch(day)
//	    {
//	    case 6:
//	    	System.out.println("Today is monday");
//	    	break;
//	    case 7:
//	    	System.out.println("Today is sunday");
//	    	break;
//	    default:
//	    	System.out.println("Looking forward to the weekend");
//	    }
	    //Java While Loop
//		int i = 0 ;
//		while ( i < 5) // dùng while cho các trường hợp đăng nhập, kiểm tra trạng thái tiến trình 
//		{
//			System.out.println(i);
//			i++;
//		}
		// Do/ While Loop
//		int i = 0;
//		do {
//		  System.out.println(i);
//		  i++;
//		} while (i < 5);		
		//Example Real-life
//		int countdown = 3;
//		while (countdown > 0)
//		{
//			System.out.println(countdown);
//			countdown--;
//		}
//		System.out.println("Happy New Year!!");
//		
//		int dice = 1;
//		while(dice <= 6)
//		{
//			if(dice < 6)
//			{
//				System.out.println("No Yatzy.");
//			}else {
//				System.out.println("Yatzy!");
//			}
//			dice = dice + 1;
//		}
//		// Java for Loop khi biết trước số vòng lặp
//		for(int i = 0 ; i < 5 ; i++)
//		{
//			System.out.println(i);
//		}
//		for(int i = 0 ; i <= 10; i += 2)
//		{
//			System.out.println(i);
//		}
//		//Java Nested Loops khi một vòng lặp nằm bên trong vòng lặp khác
//		//vòng lặp trong (inner loop) sẽ chạy mỗi lần tỏng vòng lặp ngoài ( outer loop) lặp lại 1 lần 
//		//Outer L
//		for(int i = 1 ; i <= 2 ; i++)
//		{
//			System.out.println("Outer: " + i ); // executes 2 times
//		    // Iner loop
//			for(int j = 1 ; j <= 3 ; j++)
//			{
//				System.out.println("Iner: " + j); // executes 6 times ( 2 * 3 )
//			}
//		}
//		String[] cars = {"Volvo","BMW","Ford","Mazda"};
//		for(String i : cars)
//		{
//			System.out.println(i);
//		}
		//Real-life Examples
		for(int i = 0  ; i <= 100 ; i += 10) {
			System.out.println(i);
		}
		for(int i = 0 ;  i <= 10 ; i = i + 2)
		{
			System.out.println(i);
		}
		
	    int number = 2;
	    for(int i = 1 ; i <= 10 ; i++)
	    {
	    	System.out.println(number + " x " + i + " = " + (number * i));
	    	
	    }
	}
}