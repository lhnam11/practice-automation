package Java_Tutorial;

public class java_String {
	public static void main(String[] args) {
		// Java String
		String greeting = "Hello"; // Khai báo chuỗi
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Độ dài của chuỗi là: " + txt.length()); // Độ dài chuỗi
		System.out.println(txt.toUpperCase()); // in hoa
		System.out.println(txt.toLowerCase()); // in thường
		String text = "Please locate where 'locate' occurs!";
		System.out.println(text.indexOf("where")); // Java đếm vị trí đầu từ 0

		System.out.println(text.charAt(14)); // Lấy ký tự ở vị trí cụ thể

		String fullGreeting = greeting.concat(" " + text); // Nối chuỗi
		System.out.println(fullGreeting);

		String a = "Java";
		String b = "java";
		System.out.println(a.equals(b)); // So sánh chuỗi phân biệt hoa thường

		System.out.println(a.equalsIgnoreCase(b)); // So sánh chuỗi không phân biệt hoa thường

		String firstName = "Lê";
		String lastName = "Nam";
		System.out.println(firstName + " " + lastName);

		// Java Numbers and Strings
		int x = 10;
		int y = 20;

//		String x = "10";
//		String y = "20";
		System.out.println(x + y);
		System.out.println(10 + 20 + "30"); // nếu x là chuối y là số thì sẽ chuyển y thành chuỗi nối vào x và ngược lại

	    //Ký tự đặc biệt
		System.out.println("We are the so-called \"Vikings\" from the north");
		System.out.println("It's alright");
		System.out.println("The character \\ is called blacklash");
		System.out.println("Hello\nWorld");
		System.out.println("Name:\tJohn");
	}

}
