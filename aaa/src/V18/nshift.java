package V18;
import java.util.Scanner;
public class nshift {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int[] a= {1,2,3,4,5,6};
		
		for(int i=0;i<b;i++)
		{
			int temp=a[0];
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	

}}
