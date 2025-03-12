import java.util.*;
public class Category {
	public static void main(String arg[]) {
		
		int age;
		String gender;
		Scanner sc = new Scanner(System.in);
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter gender: ");
		gender = obj.nextLine();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		
		if(gender.equals("Male") && age>21) {
			System.out.println("Eligible for marriage.");
		}else if(gender.equals("Female") && age>18) {
			System.out.println("Eligible for marriage.");
		}else {
			System.out.println("Not eligible for marriage.");
		}
	}

}
