package java_Class;
import java.util.Scanner;

public class java_UserInput {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // tạo đối tượng scanner
		
		System.out.println("Nhập tên, tuổi và lương:");
		// Đọc chuỗi
		String name = myObj.nextLine();
		// Đọc số nguyên và số thực
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

}

