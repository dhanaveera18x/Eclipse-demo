package Onestrings;

public class removevowel {

	public static void main(String[] args) {
		String a="hariharan";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(!"aeiou".contains(b[i]+""))
			{
				System.out.print(b[i]);
			}
		}
		
		// TODO Auto-generated method stub

	}

}
