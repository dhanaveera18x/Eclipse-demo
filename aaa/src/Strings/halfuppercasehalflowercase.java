package Strings;

public class halfuppercasehalflowercase {

	public static void main(String[] args) {
		String a="hariharan";
		char []b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(i<a.length()/2)
			System.out.println(Character.toLowerCase(b[i]));
		else
			System.out.println(Character.toUpperCase(b[i]));
		// TODO Auto-generated method stub
		}
	}

}
