package java_Class;

// import toàn bộ package
import java.util.Scanner;// import 1 lớp

public class java_Packages {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter user name");
        
		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName);
	}

}
