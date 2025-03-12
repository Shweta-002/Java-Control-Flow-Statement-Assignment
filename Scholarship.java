import java.util.*;
public class Scholarship {
	public static void main(String arg[]) {
		
		int marks;
		int income;
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		income = sc.nextInt();
		
		if((marks >=60 && marks<=100) && (income<=250000)) {
			System.out.println("Student eligible for scholarship");
		}else {
			System.out.println("Not eligibele for scholarship");
		}
	}

}
