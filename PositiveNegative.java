// Java program to check number is positive or negative
public class PositiveNegative {
	public static void main(String arg[]) {
		
		int num = -2;
		
		if(num < 0) {
			System.out.println("Number is negative");
		}else if(num == 0) {
			System.out.println("Number is 0");
		}else if(num > 0 ) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Invalid input");
		}
	}

}
