
public class Grade {
	public static void main(String arg[]) {
		int marks = 91;
		
		if(marks >=90 && marks <=100) {
			System.out.println("Grade: A");
		}else if(marks>=80 && marks <90) {
			System.out.println("Grade: B");
		}else if(marks >=70 && marks <80) {
			System.out.println("Grade: C");
		}else if(marks >=60 && marks<70) {
			System.out.println("Grade: D");
		}else  {
			System.out.println("Fail");
		}
	}

}
