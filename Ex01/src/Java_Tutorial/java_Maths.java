package Java_Tutorial;

public class java_Maths {
	public static void main(String[] args) {
		//Java maths
	    System.out.println(Math.max(5,10));
	    System.out.println(Math.min(5, 10));
	    System.out.println(Math.sqrt(64));
	    System.out.println(Math.abs(-4.7));
	    System.out.println(Math.random());
	    // ví dụ từ max đến min theo công thức
	    System.out.println((int)(Math.random() * (100 - 50  + 1)) + 50);
	    
	    //Java Booleans - Kiểu dữ liệu logic
	    Boolean isJavaFun = true;
	    Boolean isFishTasty = false;
	    
	    System.out.println(isJavaFun);
	    System.out.println(isFishTasty);
	    
	    int x = 10;
	    int y = 9; 
	    System.out.println(x > y);
	    System.out.println(x == 10);
	    System.out.println(10 == 15);
	    
	    int myAge = 18;
	    int votingAge = 25;
	    if(myAge >= votingAge)
	    {
	    	System.out.println("Old enough to vote");
	    }
	    else
	    {
	    	System.out.println("Not old enough to vote");
	    }
//	    // có cách khai báo if
	    int time = 20;
	    String result = (time < 18) ? "Good day." :"Good evening.";
	    System.out.println(result);
	    
	    // Real example
	    int doorCode = 1337;
	    if(doorCode == 1337) {
	    	System.out.println("Correct code. The door is now open");
	    }else {
			System.out.println("Wrong code.The door remains closed.");
		}
	}

}
