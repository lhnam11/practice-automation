package java_Methods;

public class java_Recursion {
	// Đệ quy trong java giải quyết 1 bài toán bằng cách chia nhỏ bài toán lớn thành
	// các bài toán con nhỏ hơn
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
    
	public static int sum(int start, int end)
	{
		if(end > start){
			return end + sum(start, end - 1);
		}else {
			return end;
		}
	}
	public static void main(String[] args) {
		int result1 = sum(10);
		int result2 = sum(2, 10);
		System.out.println(result1);
		System.out.println(result2);
	}

}
