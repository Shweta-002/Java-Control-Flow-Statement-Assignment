import java.util.*;

public class LargestNumber {
	public static void main(String arg[]) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		num1= sc.nextInt();
		num2 =  sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is largest");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " is largest");
		}else {
			System.out.println(num3 + " is largest");
		}
	}

}
