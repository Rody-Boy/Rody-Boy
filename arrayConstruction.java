import java.util.Arrays;
public class construct {
	public static void main(String[] args) {
		/*first declare the stringArray to data type string then construct it with the new keyword, and set the expected value of the string which is 4*/
		String[] stringArray = new String[4];
		/*initialize or assign the value on each element*/
		stringArray[0]="earl";
		stringArray[1]="paul";
		stringArray[2]="princess";
		stringArray[3]="rhod";
		System.out.println(Arrays.toString(stringArray));
	}
}