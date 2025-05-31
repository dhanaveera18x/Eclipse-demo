package veera;
import java.util.Scanner;
public class Electricitybill {

	public static void main(String[] args) {
		int electricity_unit;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the electricity unit");
		electricity_unit=scan.nextInt();
		if(50>=electricity_unit&&electricity_unit>0)
			System.out.println("electricity bill="+(electricity_unit*0.5+20)+"/unit");
		else if(150>=electricity_unit&&electricity_unit>50)
			System.out.println("electricity bill="+(electricity_unit*0.75+20)+"/unit");
		else if(250>=electricity_unit&&electricity_unit>150)
			System.out.println("electricity bill="+(electricity_unit*1.20+20)+"/unit");
		else if(electricity_unit>250)
			System.out.println("electricity bill="+(electricity_unit*1.20+20)+"/unit");
		scan.close();
	}
}
						
				
			
			
		
		
		
		// TODO Auto-generated method stub
