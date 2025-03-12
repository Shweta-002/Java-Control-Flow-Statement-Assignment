import java.util.*;

public class Triangle {
	public static void main(String arg[]) {
		 
		float side1,side2,side3;
		Scanner sc = new Scanner(System.in);
		side1 = sc.nextFloat();
		side2 = sc.nextFloat();
		side3 = sc.nextFloat();
		
		if(side1 == side2 && side1==side3) {
			System.out.println("Equilateral Traingle");
		}else if(side1==side2 || side2==side3 || side1==side3) {
			System.out.println("Isoscales Traingle");
		}else {
			System.out.println("Scalene traingle");
		}
	}

}
