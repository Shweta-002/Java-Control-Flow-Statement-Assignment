// Java program to check eligible for voting or not
public class Voting {
	public static void main(String arg[]) {
		
		int age = 101;
		if(age < 18) {
			System.out.println("Not eligible forn voting");
		}else if(age >= 18 && age <= 100) {
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Invalid age");
		}
	}

}
