package Oops;
import java.util.Scanner;

   class student2 {
	private String name,grade;
	private int tot,avg;
	public int getTot() {
		return tot;
	}
	public void setTot() {
		this.tot = m1+m2+m3+m4+m5;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = tot/5;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade() {
		this.grade =grade;
		  if(avg>250)
		  {
			  grade="pass";
		  }
		  else
		  {
			  grade="fail";
		  }
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	private int m1,m2,m3,m4,m5;

}

public class encapsulation {

	public static void main(String[] args) {
		student2 []y=new student2[10];
		Scanner scan=new Scanner (System.in);
		for(int i=0;i<2;i++) {
			y[i] = new student2();
			System.out.println("enter the name");
			y[i].setName(scan.next());
			System.out.println("enter the m1");
			y[i].setM1(scan.nextInt());
			System.out.println("enter the m2");
			y[i].setM2(scan.nextInt());
			System.out.println("enter the m3");
			y[i].setM3(scan.nextInt());
			System.out.println("enter the 4");
			y[i].setM4(scan.nextInt());
			System.out.println("enter the 5");
			y[i].setM5(scan.nextInt());
			y[i].setTot();
			y[i].setGrade();
		}
		
		for(int i=0;i<2;i++) {
			System.out.println(y[i].getTot());
			System.out.println(y[i].getGrade());
		}
		
		
		

	}

}
