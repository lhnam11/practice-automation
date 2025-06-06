package Java_Tutorial;

public class java_TypeCasting {
	public static void main(String[] args) {
		// 1. Widening Casting( Tự động )
		int myInt = 9;
		double mydouble = myInt; // tự động ép kiểu int sang double
		System.out.println(myInt);
		System.out.println(mydouble);

		double MyDouble = 9.78;
		int MyInt = (int) MyDouble; // ép kiểu thủ công
		System.out.println(MyDouble);
		System.out.println(MyInt);
//		// Real-life example
		int maxScore = 500;
		int userScore = 423;
		// ép kiểu userScore sang float để tính chính xác
		float percentage = (float) userScore / maxScore * 100.0f;
		System.out.println("User's percentage is " + percentage);
	}

}
