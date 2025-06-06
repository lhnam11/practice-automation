package java_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class java_Date {
	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		LocalTime myObj1 = LocalTime.now();
		// LocalDateTime myObj2 = LocalDateTime.now();
		// System.out.println(myObj2);

		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println("Before formatting: " + myObj3);
		DateTimeFormatter myformatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myObj3.format(myformatObj);
		System.out.println("After formatting:  " + formattedDate);
	}
}
