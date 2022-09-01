import java.util.*;
class it104
{
public static void main(String[] args)
{

int age;
String name;

Scanner x= new Scanner(System.in);

System.out.println("Enter your name: ");
name = x.nextLine();

System.out.println("Enter you age :");
age = x.nextInt();

System.out.println("Your name is " + name);
System.out.println("Your age is " +age) ;
}
}