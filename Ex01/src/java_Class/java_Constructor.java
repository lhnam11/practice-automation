package java_Class;
// nếu không tạo constructor, java sẽ tạo mặc định constructor kh tham số, constructor giúp gán giá trị ban đầu của thuộc tính
// constuctor sẽ tạo được nhiều đối tượng ví dụ không tham số, có tham số .v..v.v.
public class java_Constructor {
	int x;
	int modelYear;
	String modelName;

	public java_Constructor() {
		x = 5;
	}

	public java_Constructor(int y) {
		x = y;
	}

	public java_Constructor(int year, String Name) {
		modelYear = year;
		modelName = Name;
	}

	public static void main(String[] args) {
		java_Constructor myObj = new java_Constructor();
		System.out.println(myObj.x);
		// có tham số
		java_Constructor myObj1 = new java_Constructor(10);
		System.out.println(myObj1.x);
		// nhiều tham số
		java_Constructor myobj2 = new java_Constructor(1969, "BMW");
		System.out.println("Thông tin xe hơi: " + myobj2.modelYear + "-" + myobj2.modelName);

	}
}
