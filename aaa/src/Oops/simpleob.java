package Oops;
import java.util.Scanner;

	
	
	class ipl{
		private String name1,name2,name3,name4;

		public String getName1() {
			return name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2 = name2;
		}

		public String getName3() {
			return name3;
		}

		public void setName3(String name3) {
			this.name3 = name3;
		}

		public String getName4() {
			return name4;
		}

		public void setName4(String name4) {
			this.name4 = name4;
		}
		
	}
	public class simpleob {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ipl y=new ipl();
		System.out.println("enter the name1");
		y.setName1(scan.next());
		System.out.println("enter the name2");
		y.setName2(scan.next());
		System.out.println("enter the name3");
		y.setName3(scan.next());
		System.out.println("enter the name4");
		y.setName4(scan.next());
		System.out.println(y.getName1());
		System.out.println(y.getName2());
		System.out.println(y.getName3());
		System.out.println(y.getName4());
		
		
				
		

	}

	}


