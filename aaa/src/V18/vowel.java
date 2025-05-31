package V18;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char a;
		System.out.println("entr the number");
		a=scan.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.println(" vowel");
		}
		else
			System.out.println("not vowel");
		
		// TODO Auto-generated method stub

	}

}
