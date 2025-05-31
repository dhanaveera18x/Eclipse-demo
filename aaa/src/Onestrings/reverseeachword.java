package Onestrings;

public class reverseeachword {

	public static void main(String[] args) {
		String a="hariharan is working";
		
		String []b=a.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
