package my;
import java.util.Scanner;

public class onetoanother {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int num=scan.nextInt();
int i,j;
System.out.println("enter the arrays element");
int a[]=new int[num];
for( i=0;i<num;i++)
{
	a[i]=scan.nextInt();
	
}
 a[2]=8;
 
	 for( i=0;i<num;i++)
	 {
		 System.out.println(a[i]);
	 }
	 
 



	}

}
