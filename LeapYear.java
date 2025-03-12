
public class LeapYear {
	public static void main(String arg[]) {
		int Year = 1900;
		
		if(Year % 4 == 0) {
			if((Year%100!=0) || (Year%400==0)) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not a leap year");
			}
		}else {
			System.out.println("Not a leap year");
		}
	}

}
