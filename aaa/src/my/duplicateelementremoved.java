package my;
import java.util.Scanner;
public class duplicateelementremoved {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array size");
		int r=scan.nextInt();
		int a[]=new int[r];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		for( i=0;i<a.length;i++) {//ADCENDING
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		System.out.println("ascending order");
		for(i=0;i<a.length;i++)//ASCENDINGPRINT
		{
			System.out.println(a[i]);
		}
		
		j=0;
		for(i=0;i<a.length-1;i++)//DUPLICATEREMOVE
		{
			if(a[i]!=a[i+1])
				a[j++]=a[i];
			}
		a[j++]=a[a.length-1];
		System.out.println("duplicate element removed");
		for(i=0;i<j;i++)//duplicate print
		{
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
