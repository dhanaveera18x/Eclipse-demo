package my;
import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {

	int i,j,temp=0;
			int a[]= {9,8,7,6,5,1,2,3,4,3,2,1};
			System.out.println("before");
			for(i=0;i<a.length;i++)
				
			{
				System.out.print(a[i]+" ");
			}
			System.out.println("after");
			for(i=0;i<a.length;i++)
			{
				for (j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
			}}}
				for(i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
				
	
		}
	}
	
	
	

	