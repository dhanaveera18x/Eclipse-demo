package V18;

public class strong {

	public static void main(String[] args) {
	int a=145,mul=1,sum=0;
	for(int b=a,d;b>0;b=b/10,d++)
	{
		d=b%10;
		for(int i=d;i>0;i--)
		{
			mul=mul*i;
			sum=sum+mul;
			
		}
	}
        System.out.println(sum);
	}

}
