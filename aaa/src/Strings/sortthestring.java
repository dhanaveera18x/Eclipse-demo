package Strings;

public class sortthestring {

	public static void main(String[] args) {
		String a="hariharan";
		char []b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++) {
			   if(b[i]>b[j])
			{
				char temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				
				
			}
		}
		}
		
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]+" ");
			}
		// TODO Auto-generated method stub

	}
	}

