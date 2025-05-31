package Onestrings;

public class capitalfirstword {

	public static void main(String[] args) {
		String a="this is hariharan working in niit";
		String [] b= a.split(" ");
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		
		}
		b[0]=b[0].toUpperCase();
		// TODO Auto-generated method stub
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
			}
	}

}
