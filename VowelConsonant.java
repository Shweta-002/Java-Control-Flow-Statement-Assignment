import java.util.*;
public class VowelConsonant {
	public static void main(String arg[]) {
		
		char a;
		Scanner sc = new Scanner (System.in);
		a = sc.next().charAt(0);
		int asciivalue = (int)a;
		
		if(a>=65 && a<=90) {   // uppercase condition using unicode value
			if(a=='A' ||a=='E' || a=='I' || a=='O' || a=='U') {
				System.out.println("Uppercase Vowel");
			}else {
				System.out.println("Uppercase Consonant");
			}
		}else if(a>=97 && a<=122) {    // lowercase condition using unicode value
			if(a=='e' || a=='a' || a=='i' || a=='o' || a=='u') {
				System.out.println("Lowercase Vowel");
			}else {
				System.out.println("Uppercase Consonent");
			}
		}
	}

}
