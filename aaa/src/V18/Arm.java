package V18;

public class Arm {

	public static void main(String[] args) {
		int a=153,c=0,s=0;
		for(int b=a;b>0;b=b/10,c++);
		
		for(int b=a;b>0;b=b/10)
		{
		int d=b%10;
		System.out.println(d);
		s=s+(int)Math.pow(d,c);
		}
		System.out.println(s);
if(a==s)
{
	System.out.println("Armstrong number");
}
else
{
	System.out.println("Not a armstrong no");
}
	}

}
