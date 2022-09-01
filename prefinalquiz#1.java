public class prefinalquiz1 { 	
    public static void main(String arg[]) {
           	multiplicationTable(5);
    }
           	public static void multiplicationTable(int table) {
           	         for (int i = 1; i <= table; ++i)
           	         System.out.println(i+ " * " + table+" = " + table * i);
    }
}