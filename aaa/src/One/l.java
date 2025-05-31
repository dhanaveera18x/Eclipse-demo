package One;

public class l {

	public static void main(String[] args) {
		String a="hariharan";
		int count=0;
		char b[]=a.toCharArray();
		char c[]= new char[256];
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length-1;j++)
			{
			if((b[i]==b[j]))
			{
				count=count+i;			
		
			if(count<=1)
			{
			System.out.print(b[i]);
			}
		// TODO Auto-generated method stub
			}
	}

}}
}
