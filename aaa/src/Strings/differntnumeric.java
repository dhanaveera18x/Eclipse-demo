 package Strings;

public class differntnumeric {

	public static void main(String[] args) {
		String a="HariHaraN";
		for(char z:a.toCharArray())
		{
			if(Character.isUpperCase(z))
			{
				System.out.print(z);
			}
			 
		}
		System.out.println(" ");
		for(char z:a.toCharArray())
		{
			
			 if(Character.isLowerCase(z))
			{
				System.out.print(z);
			}
		}
		
		

	}

}
