package java_Class;

public class java_ClassAttributes {
	int x = 10;
//	final int x = 20;
	String fname = "Lê";
	String lname = "Nam";
	int age = 24;
	final String nationnality = "American";

	public static void main(String[] args) {
		java_ClassAttributes student1 = new java_ClassAttributes();
		java_ClassAttributes student2 = new java_ClassAttributes();
		student2.age = 22;
		System.out.println("== Person1 ==");
		System.out.println("Name: " + student1.fname + " " + student1.lname);
		System.out.println("Age: " + student1.age);
		System.out.println("Nationality: " + student1.nationnality);
		System.out.println("\n== Person2 ==");
		System.out.println("Name: " + student2.fname + " " + student2.lname);
		System.out.println("Age: " + student2.age);
		System.out.println("Nationality: " + student2.nationnality);
		java_ClassAttributes myObj = new java_ClassAttributes();
		myObj.x = 25; // x is now 25 
		System.out.println(myObj.x);
	}

}
