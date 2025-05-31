package Strings;
import java.util.Scanner;
public class frequencyofcharacter1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a =scan.nextLine();
		char b[]=a.toCharArray();
		char e=scan.next().charAt(0);
		
		

			int count=0;
			for(int j=0;j<b.length;j++)
			{
				
			
			if(e==b[j])
			{
				count++;
				
			}
			
				
	
			}
			System.out.print(e+""+count);
		}
		// TODO Auto-generated method stub

	}


