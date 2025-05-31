package Oops;
import java.util.Scanner;
 class football{
	 private String name,country;
	private int jersey;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCountry(String country )
	{
		this.country=country;
	}
	 public void setJersey(int jersey)
	 {
		 this.jersey=jersey;
		 
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public String getCountry()
	 {
		 return country;
	 }
	 
	 public int getJersey()
	 {
		 return jersey;
	 }
}

public class polymor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		football []f=new football[10];
		for(int i=1;i<10;i++)
		{
			System.out.println(i+"player details");
		f[i].setName(scan.next());
		f[i].setCountry(scan.nextLine());
		f[i].setJersey(scan.nextInt());
		
		}
		System.out.println("1.view 2.insert");
		int a=scan.nextInt();
		if( a==1);
		{
			for(int i=0;i<3;i++) {
		System.out.println(f[i].getName());
		System.out.println(f[i].getCountry());
		System.out.println(f[i].getJersey());
		}
		// TODO Auto-generated method stub

	}}

}
