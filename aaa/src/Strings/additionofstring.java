package Strings;

public class additionofstring {

	public static void main(String[] args) {
		String a= "Hariharan@123";
		int sum='0';
		for(char z:a.toCharArray())
		{
			if(Character.isDigit(z))
			{	
				sum=sum+(int)z-48;;
				
				
			}
			
		}
		System.out.println(sum);
		
	}

}
