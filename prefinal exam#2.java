import java.awt.*;
public class reference {
	public static void main(String[] args) {
		int a=12;
		int b =a;
		Point x=new Point (13,12);
		Point y=x;
		b=16;
		y.x=19;
		System.out.println(b);
		System.out.println(x);
		System.out.print(a);
	}
}