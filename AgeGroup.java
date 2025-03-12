import java.util.*;
public class AgeGroup {
	public static void main(String arg[]) {
		
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		{
		if(age >=0 && age <=12 ) {
			System.out.println("Child");
		}else if(age>=13 && age<=19) {
			System.out.println("Teenager");
		}else if(age >=20 && age<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}
	}

}
}