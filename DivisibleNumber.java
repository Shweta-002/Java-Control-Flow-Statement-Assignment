import java.util.*;
public class DivisibleNumber {
	public static void main(String arg[]) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		if(num%5==0 && num%11==0) {
			System.out.println("Number is divisible by 5 and 11");
		}else {
			System.out.println("Number is not divisible by 5 or 11");
		}
	}

}
