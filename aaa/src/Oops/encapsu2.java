package Oops;

import java.util.Scanner;
class student3 {
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
public class encapsu2{
	
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
        student3 []y=new student3[10];
         int i=0;
      for(;;) {
	

	System.out.println("1.insert,2.view,3.delete");
	int a=scan.nextInt();

	

	if(a==1) {
		
		student3 r = new student3();
		System.out.println("enter the name");
		r.setName(scan.next());
		System.out.println("enter the m1");
		r.setM1(scan.nextInt());
		System.out.println("enter the m2");
		r.setM2(scan.nextInt());
		System.out.println("enter the m3");
		r.setM3(scan.nextInt());
		System.out.println("enter the 4");
		r.setM4(scan.nextInt());
		System.out.println("enter the 5");
		r.setM5(scan.nextInt());
	    r.setTot();
	    r.setGrade();
        y[i++]=r;
	   }
      
	if(a==2) {

    for(int j=0;j<i;j++) {
	System.out.println(y[j].getName());
    System.out.println(y[j].getTot());
    System.out.println(y[j].getGrade());

	}
}
	
}
}
}