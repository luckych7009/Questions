package Questions;
import java.util.Scanner;
public class question_2 {
public static void main(String[]args) {
	//program for sum of three numbers
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter value of a : ");int a=sc.nextInt();
	System.out.print("Enter value of b : ");int b=sc.nextInt();
	System.out.print("Enter value of c : ");int c=sc.nextInt();
	int sum=a+b+c;System.out.println("Sum of a ,b and c is : " +sum);
	//program to greet user
	System.out.print("Enter your name : ");
	String name=sc.next();
	System.out.println("Hello "+name+",have a good day.");
	//convert km to miles
	System.out.print("Enter number of km :");float km=sc.nextFloat();
	float miles=km* 0.62137119f;
	System.out.println("km into miles : " +miles);
	//to detect wheather a number entered by the user is integer or not
	System.out.print("Enter your number to check it is integer or not :");boolean number= sc.hasNextInt();
	System.out.println(number);

}
}
