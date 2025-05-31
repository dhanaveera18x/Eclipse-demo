package veera;

import java.util.Scanner;

public class Gradeb {

	public static void main(String[] args) {
		int physics,chemistry,biology,maths,computer,average,mean;
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
		average=((physics+chemistry+biology+maths+computer)/5);
		if(100>=average && average>=90)
			System.out.println("grade A");
		if(90>average && average>=80)
			System.out.println("grade B");
		if(80>average && average>=70)
			System.out.println("grade C");
		if(70>average && average>=60)
			System.out.println("grade D");
		if(60>average && average>=50)
			System.out.println("grade E");
		else
			System.out.println("grade F");
		scan.close();
			
		// TODO Auto-generated method stub

	}

}
