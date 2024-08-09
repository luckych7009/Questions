package Questions;
import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	       //1.program to check if a number is even or odd.......
	        System.out.print("Enter value of A : "); int A=sc.nextInt();
	        if(A%2==0) {
	            System.out.println("This is even number.");
	        }else{
	            System.out.println("This is odd number.");
	        }
	        //2.Create a program to determine the largest of two numbers......
	        System.out.print("Enter value of num1 :"); int num1=sc.nextInt();
	        System.out.print("Enter value of num2 :"); int num2=sc.nextInt();
	        if(num1>num2){
	            System.out.println("num1 is greater than num2.");
	        } else if (num2>num1) {
	            System.out.println("num2 is greater than num1.");
	        } else{
	            System.out.println("num1 is equal to num2.");
	        }
	        //3.Write a Java program to check if a character is an alphabet or not.
	        System.out.print("Enter character value : ");char check=sc.next().charAt(0);
	        if(check>='a'&& check<='z' || check>='A' && check<='Z'){
	            System.out.println("It is an alphabet.");
	        }
	        else{
	            System.out.println("it is not a alphabet.");
	        }
	        //4.Create a program to determine if a year is a leap year or not.
	        System.out.print("Enter your year :");int year=sc.nextInt();
	        if((year%4==0 && year%100!=0)||(year%400==0)){
	            System.out.println(year+ " It is a leap lear...");
	        }
	        else{
	            System.out.println(year+ " It is not leap year...");
	        }
	        //5.Write a Java program to check if a number is positive, negative, or zero.
	        System.out.print("Enter your number : ");int number=sc.nextInt();
	         if(number>0){
	             System.out.println("It is a positive number.");
	         } else if (number<0) {
	             System.out.println("It is a negative number.");
	         }
	         else{
	             System.out.println("It is zero.");
	    }
	       // 6.Write a Java program to determine the largest of three numbers.
	        System.out.print("Enter value of x: "); int x=sc.nextInt();
	        System.out.print("Enter value of y: "); int y=sc.nextInt();
	        System.out.print("Enter value of z: "); int z=sc.nextInt();
	        if(x>y && x>z){
	            System.out.println("x is greatest.");
	        } else if (y>x && y>z) {
	            System.out.println("y is greatest.");
	        } else if (z>x && z>y) {
	            System.out.println("z is greatest.");
	        }
	        else{
	            System.out.println("it is equal.");
	        }
	        //7. Create a program to check if a string is a palindrome or not.
	        System.out.println("Enter your string : ");String str=sc.nextLine();
	        String reversedStr = new StringBuilder(str).reverse().toString();
	        if(str.equalsIgnoreCase(reversedStr)){
	        System.out.println("It is a palindrome.");
	        }
	        else{
	        System.out.println("It is not a palindrome.");
	        }

	       //8.Write a Java program to check if a string is empty or not.
	        System.out.print("Enter your name : "); String name=sc.nextLine();
	        name.isEmpty();
	        if(name.isEmpty()){
	            System.out.println("String is empty.");
	        }
	        else {
	            System.out.println("String is not empty.");
	        }
	      //9.Create a program to determine the sum of two numbers, but only if they are both positive.
	        System.out.print("Enter value of r_1 : "); int r_1= sc.nextInt();
	        System.out.print("Enter value of r_2 : ");int r_2= sc.nextInt();
	        if(r_1>=0 && r_2>=0){
	            int addition=r_1+r_2;
	            System.out.println("Addition of r_1 and r_2 :  "+addition);
	        }
	        else {
	            System.out.println("retry after enter positive numbers.");
	        }

	        //10.Write a Java program to check if a number is a multiple of 3 or 5.
	        System.out.print("Enter your number :");int table=sc.nextInt();
	        if(table%3==0 || table%5==0){
	            System.out.println("it is a multiple of 3 or 5.");
	        }else{
	            System.out.println("it is not a multiple of 3 or 5.");
	        }
	}

}
