package Java_Tutorial;

public class java_Switch {
	public static void main(String[] args) {
		  //Java switch
	    int day = 4;
	    switch(day) {
	    case 1:
	    	System.out.println("Monday");
	    	break;
	    case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	    
	    switch(day)
	    {
	    case 6:
	    	System.out.println("Today is monday");
	    	break;
	    case 7:
	    	System.out.println("Today is sunday");
	    	break;
	    default:
	    	System.out.println("Looking forward to the weekend");
	    }
	}

}
