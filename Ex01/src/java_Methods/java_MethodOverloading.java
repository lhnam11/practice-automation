package java_Methods;

public class java_MethodOverloading {
	// nhiều phương thức cùng tên nhưng khác nhau về số lượng hoặc kiểu dữ liệu tham
	// số
	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int myNum1 = plusMethod(5, 3);
		double myNum2 = plusMethod(2.55, 3.44);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);

	}
}
