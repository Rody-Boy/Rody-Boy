public class Main {
	public static void main(String[] args) {
		topHalf();
	bottomHalf();
	}
		public static void topHalf() {
		for (int line =  1; line <= 4; line++) {
			System.out.print("|");
			
			for (int space = 1; space <= (line * -2 + 8); space++) {
				System.out.print(" ");
		}
			System.out.print("<>");
			
			for (int dot = 1; dot <= (line *4 -4); dot++) {
				System.out.print(".");
				
		}
			System.out.print("<>");
			
			for (int space =  1; space <= (line * -2 + 8); space++) {
				System.out.print(" ");
		}
			System.out.println("|");
		}
	}//bottomhalf
	public static void bottomHalf() {
		for (int line =  1; line <= 4; line++) {
			System.out.print("|");
			
			for (int space = 1; space <= (line +2-1); space++) {
				System.out.print(" ");
		}
			System.out.print("<>");
			
			for (int dot = 1; dot <= (line * -3+ 13-2); dot++) {
				System.out.print(".");
				
		}
			System.out.print("<>");
			
			for (int space =  1; space <= (line -8); space++) {
				System.out.print("");
		}
			System.out.println("|");
		}
	}
}


	
	
	
	

		
		
		