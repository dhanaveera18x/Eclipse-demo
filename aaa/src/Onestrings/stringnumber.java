package Onestrings;

public class stringnumber {

	public static void main(String[] args) {
		String a="h3g3f3";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(Character.isDigit(b[i]))
			{
				int c=Character.getNumericValue(b[i]);
				for(int j=0;j<c;j++)
				{
					
				
				System.out.print(b[i-1]);
			}}
		}
		// TODO Auto-generated method stub

	}

}
