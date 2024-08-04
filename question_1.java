package Questions;
import java.util.Scanner;
public class question_1 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		//Program to calculate percentage
		System.out.print("Enter number of sub1 :"); float sub1=in.nextFloat();
		System.out.print("Enter number of sub2 :"); float sub2=in.nextFloat();
		System.out.print("Enter number of sub3 :"); float sub3=in.nextFloat();
		System.out.print("Enter number of sub4 :"); float sub4=in.nextFloat();
		System.out.print("Enter number of sub5 :"); float sub5=in.nextFloat();
		System.out.print("Total marks of 5 subject obtain from 500 is :");
		float total=sub1+sub2+sub3+sub4+sub5;
		System.out.println(total);
		float average=total/500*100;
		System.out.println("average obtain :"+average);
		if(average<33) {
			System.out.println("Sorry, You need more hardwork");
		}
		else {
			System.out.println("congratulations, you are promoted to next semester...");
		}
	}

}
