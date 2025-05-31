package V18;

public class binarytodecimal {

	public static void main(String[] args) {
		int a,x=0,d=0;
		for(a=101010;a>0;a=a/10 )
		{
		int c=a%10;
			
			d=d+(c*(int)Math.pow(2,x++));
			
		}
		System.out.print(d);
		// TODO Auto-generated method stub

	}

}
