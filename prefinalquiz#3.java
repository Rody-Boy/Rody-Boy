import java.awt.*;
public class TrianglePerimeter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Point p1 = new Point();      
        Point p2 = new Point(a, b);
        double c = p1.distance(p2);
        double perimeter = a + b + c;
        System.out.println("perimeter is " + perimeter);
    }
}