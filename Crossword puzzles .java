import java.util.Scanner;
public class crossWord {
public static void main(String[] args) {
String crossWord = ("EVHTOFFIPV\n" + 
                "XIXUQLONRA\n" + 
                "PJAVAORTER\n" + 
                "RGSTIWLECI\n" + 
                "EUAYPCOGEA\n" + 
                "SCOPEHOEDB\n" + 
                "SKCETAPREL\n" + 
                "IHXAGRPONE\n" + 
                "OVAOITBOCS\n" + 
                "NAYQIEUJEP\n");
                         
                         
char[] array = crossWord.toCharArray();
for(char c : array) {
System.out.print(c+" ");
}
System.out.println("\nIdentify the following questions by finding the answer in the crossword puzzle above\n<PLEASE ANSWER IN UPPERCASE>");

Scanner in = new Scanner(System.in);
System.out.println("\n1. A category or set of data values: ");
String q1=in.nextLine();

System.out.println("\n2. a class-based, object-oriented programming language: ");
String q2=in.nextLine();

System.out.println("\n3. A data value, or a set of operations that compute a data value: ");
String q3=in.nextLine();

System.out.println("\n4. a control flow statement that iterates a part of the programs multiple times.: ");
String q4=in.nextLine();

System.out.println("\n5. Order in which operations are computed in an expression.: ");
String q5=in.nextLine();

System.out.println("\n6. piece of your computer's memory that is given a name and type and can store a value: ");
String q6=in.nextLine();

System.out.println("\n7. a type of diagram that represents a workflow or process.: ");
String q7=in.nextLine();

System.out.println("\n8. The part of a program where a variable exists: ");
String q8=in.nextLine();

System.out.println("\n9. a whole number a number that is not a fraction: ");
String q9=in.nextLine();


System.out.println("\n\nThis are your answers from 1 to 9: ");
System.out.println(q1);
System.out.println(q2);
System.out.println(q3);
System.out.println(q4);
System.out.println(q5);
System.out.println(q6);
System.out.println(q7);
System.out.println(q8);
System.out.println(q9);


System.out.println("\n\nHere are the words that can be found in the puzzle and its meanings: \nType-A category or set of data values\n\nJava-a class-based, object-oriented programming language\n\nExpression-A data value, or a set of operations that compute a data value.\n\nForLoops-a control flow statement that iterates a part of the programs multiple times.\n\nPrecedence-Order in which operations are computed in an expression.\n\nVariables-piece of your computer's memory that is given a name and type and can store a value.\n\nFlowchart-a type of diagram that represents a workflow or process.\n\nScope-The part of a program where a variable exists.\n\nInteger-a whole number a number that is not a fraction");
}
}
