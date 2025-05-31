package V18;

public class Arm_str {

	public static void main(String[] args) {
		int a=153,c=(""+a).length(),s=0;
		for(int x:(""+a).toCharArray())
		{
			s=s+(int)Math.pow(x-48,c);
		}
		System.out.println(s);
	
	if(a==s)
	{
		System.out.println("arm");
	}
	else
	{
		System.out.println("not");
	}
	}
}
