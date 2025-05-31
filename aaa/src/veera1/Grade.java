package veera;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int physics,chemistry,biology,maths,computer;
		Scanner scan=new Scanner(System.in);
		System.out.println("physics");
		physics=scan.nextInt();
		System.out.println("chemistry");
		chemistry=scan.nextInt();
		System.out.println("maths");
		maths=scan.nextInt();
		System.out.println("biology");
		biology=scan.nextInt();
		System.out.println("computer");
		computer=scan.nextInt();
		if(100>=(physics||chemistry||biology||maths||computer)&&(physics||chemistry||biology||maths||computer)>=90)
			System.out.println("grade A");
		else if((90>physics||chemistry||biology||maths||computer)&&(physics||chemistry||biology||maths||computer)>=80)
			System.out.println("grade B");
		else if((80>physics||chemistry||biology||maths||computer)&&(physics||chemistry||biology||maths||computer)>=70)
			System.out.println("grade C");
		else if((70>physics||chemistry||biology||maths||computer)&&(physics||chemistry||biology||maths||computer)>=60)
			System.out.println("grade D");
		else if((60>physics||chemistry||biology||maths||computer)&&(physics||chemistry||biology||maths||computer)>=50)
			System.out.println("grade E");
		else 
			System.out.println("FAIL");
		scan.close();
		// TODO Auto-generated method stub

	}

}
