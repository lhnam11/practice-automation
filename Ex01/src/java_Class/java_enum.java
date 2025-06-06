package java_Class;

public class java_enum {
	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);

		// thường được dùng trong swtich để kiểm tra giá trị tương ứng

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("Hight Level");
			break;
		}
		for(Level myVarFor : Level.values())
		{
			System.out.println(myVarFor);
		}
	}
}
