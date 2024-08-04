package Questions;
import java.util.Scanner;
public class Question_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
float a=7/4f*9/2f;
System.out.println("Solution of the given equation  : "+a);
System.out.print("Encrypt a grade by adding 8 to A : ");
char grade='A';
 grade =(char)(grade+8);System.out.println(grade);
	System.out.print("Decrypt a grade by subtracting 5 to K : ");
	char grade_='K';
	grade=(char)(grade_-5);System.out.println(grade);
	System.out.print("Enter value of num1 : ");int num1=sc.nextInt();
	System.out.print("Enter value of num2 : ");int num2=sc.nextInt();
	System.out.println(num1>=num2);//using comparison operators to check num1 is greater than num2 or not
	int x=7;
	int z=7*49/7+35/7;
	System.out.println("Value of z : "+z);
	}
}
