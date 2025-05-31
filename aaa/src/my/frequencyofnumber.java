package my;
import java.util.Scanner;



 class  Number {
	 
	int fun(int a[],int b) {
		int count=0;
		
		
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==b)
	{
	 count++;
	}
		
	}
	
	
	
	return count;
	
}}
public class frequencyofnumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]= {1,2,3,4,5,5,4,3,6,8,5};
		Number y=new Number();
		int b=scan.nextInt();
		int z=y.fun(a,b);// TODO Auto-generated method stub
System.out.println(z);
	}
}

