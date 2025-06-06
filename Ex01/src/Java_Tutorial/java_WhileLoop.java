package Java_Tutorial;

import java.util.ArrayList;

public class java_WhileLoop {
	public static void main(String[] args) {
////	    Java While Loop
//		int i = 0 ;
//		while ( i < 5) // dùng while cho các trường hợp đăng nhập, kiểm tra trạng thái tiến trình 
//		{
//			System.out.println(i);
//			i++;
//		}
////		 Do/ While Loop
//	//	int i = 0;
//		do {
//		  System.out.println(i);
//		  i++;
//		} while (i < 5);		
////		Example Real-life
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
//	}
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
//		for(int i = 0  ; i <= 100 ; i += 10) {
//			System.out.println(i);
//		}
//		for(int i = 0 ;  i <= 10 ; i = i + 2)
//		{
//			System.out.println(i);
//		}
//		
//	    int number = 2;
//	    for(int i = 1 ; i <= 10 ; i++)
//	    {
//	    	System.out.println(number + " x " + i + " = " + (number * i));
//	    	
//	    }
		// foreach
		// hiển thị danh sách sản phẩm
		String[] products = {"Bánh mì","Sữa","Cà Phê"};
		for(String i : products)
		{
			System.out.println("Sản phẩm hiện có: " + (i));
		}
		// Tổng tiền 
	    int prices[] = {10000,20000,30000,40000,1040};
	    int total = 0;
	    for(int price :prices)
	    {
	    	total += price;
	    }
	    System.out.println("Tổng giá tiền sản phẩm: " + (total));
	    
	    //in danh sách 
	    ArrayList<String> students = new ArrayList<>();
	    students.add("Nam");
	    students.add("Huy");
	    students.add("Trang");
	    
	    for(String name : students)
	    {
	    	System.out.println("Sinh viên: " + name);
	    	
	    }
	}

}
