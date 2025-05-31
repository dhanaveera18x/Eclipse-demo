package Fun;
import java.util.Scanner;
public class Manoj {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		char[]b=a.toCharArray();
		int sum=0;
		if(b.length%2==0)
		{
			System.out.println(b[b.length/2]+","+b[(b.length/2)+1]);
		}
		else
		{
			System.out.println(b[b.length+1/2]);
		}
			
		 
		
		

	}

}
