package Questions;
import java.util.Scanner;
public class question_5 {

	public static void main(String[] args) {
		Scanner take=new Scanner(System.in);
int a=10;
if(a==11) {
	System.out.print("i am 11.");
}else{
	System.out.println("i am not 11.");
}
//to check fail or pass
System.out.print("Enter marks of sub1 : ");float sub1=take.nextFloat();
System.out.print("Enter marks of sub2 : ");float sub2=take.nextFloat();
System.out.print("Enter marks of sub3 : ");float sub3=take.nextFloat();
float total=sub1+sub2+sub3;System.out.println("Total obtain marks of 3 subjects: "+total);
float average=total/300*100;System.out.println("Average obtain : "+average);
if(average>=33 && sub1>=33 && sub2>=33 && sub3>=33) {
	System.out.println("You are promoted to next class...");
}
else {
	System.out.println("sorry,Try hard next time...");
}
//To findout the day of the week 
System.out.print("Enter your number :");int day=take.nextInt();
switch(day) {
case 1:System.out.print("Monday");break;
case 2:System.out.print("Tuesday");break;
case 3:System.out.print("wednesday");break;
case 4:System.out.print("Thursday");break;
case 5:System.out.print("Friday");break;
case 6:System.out.print("Saturday");break;
case 7:System.out.print("Sunday");break;
default:System.out.print("Please enter correct input .");
}
	}
}
