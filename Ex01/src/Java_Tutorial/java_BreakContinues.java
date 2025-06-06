package Java_Tutorial;

public class java_BreakContinues {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		for (int j = 0; j < 10; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j);
		}
		// Dùng break và continue trong while loop
	    int a = 0;
	    while(a < 10)
	    {
	    	System.out.println(a);
	    	a++;
	    	if(a == 4) break;
	    }
	    int b = 0;
	    while(b < 10)
	    {
	    	System.out.println(b);
	    	b++;
	    	if(b==4) continue;
	    }
	}

}
