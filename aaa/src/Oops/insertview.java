package Oops;
import java.util.Scanner;

class keerthi{
	
	
	
		private String name;
		private int player;
		
		public void setName(String name) {
			this.name=name;
			
		}
		public void setPlayer(int player) {
			this.player=player;
		}
		
		public String getName() {
			return name;
			
		}
		public int getPlayer()
		{
			return player;
		}
		public String display() {
			return name+" "+player;
			
		}
	
}
 class insertview{
	 public static void main(String args[] ){
		 Scanner scan=new Scanner(System.in);
		 keerthi n=new keerthi();
		String name;
		int player;
		n.setName(scan.nextLine());
	
		n.setPlayer(scan.nextInt());
		
		System.out.println(n.display());
		
		 
		 
		 
				 scan.close();
		 
	 }
 }


