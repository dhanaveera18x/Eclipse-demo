package veera;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char a;
		Scanner scan=new Scanner(System.in);
	
		System.out.println("enter th character:");
		  a=scan.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			System.out.println("it is a vowel");
		else
			System.out.println("it is a consonent");
		scan.close();
		// TODO Auto-generated method stub

	}

}
