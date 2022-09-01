import java.util.*;
public class descend {
	
	public static void main(String[] args) {
		
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter the lowest number");
		int lowest = x.nextInt();
		
		System.out.println("Enter the second lowest number");
		int middle = x.nextInt();
		
		System.out.println("Enter the highest number");
		int highest = x.nextInt();
		
		System.out.println("The numbers from highest to lowest are " + highest +"," + middle +"," + lowest  + ".");

}
}