public class Main {
	public static void main(String[] args) {
		printDiamond(1);
	}
		public static void printDiamond(int  height) {
		int i, j= 1;
        int n=3;
        for (j = 1; j <= n; j++) {
        	for (i = 1; i <= height+1; i++) 
            {
                System.out.print(" ");
            }
            height--;
            for (i = 1; i <= 2* j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        height= 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= height; i++) 
            {
                System.out.print(" ");
            }
            height++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

