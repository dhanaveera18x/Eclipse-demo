package veera;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		int purchased_amount,selled_amount;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount:");
		purchased_amount=scan.nextInt();
		System.out.println("enter the selled amount:");
		selled_amount=scan.nextInt();
		if((selled_amount-purchased_amount)>0)
			System.out.println("profit amount="+(selled_amount-purchased_amount ));
		else if((selled_amount-purchased_amount)<0)
			System.out.println("loss amount="+(selled_amount-purchased_amount ));
		else
			System.out.println("zero profit/loss");
		scan.close();
			
		
		
		// TODO Auto-generated method stub

	}

}
