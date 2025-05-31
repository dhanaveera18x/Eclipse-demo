package exercise;
import java.util.Scanner;
class Steel{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
//		for(int i=1,b=scan.nextInt(),c=0;i<=10;i++)
//		{
//			c=i*b;
//			System.out.println(i+"*"+b+"="+c);
//		}
//		int s=1;
//		for(int i=scan.nextInt();i>0;i--)
//		{
//			s=s*i;
//			
//		}
//		System.out.println(s);
//		
		for(int i=1 ,a=scan.nextInt();i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
	}
}

