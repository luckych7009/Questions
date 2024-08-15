package Questions;
import java.util.Scanner;
public class Practice_set5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//1.Sum of first n even numbers using while loop.
		System.out.print("Enter your number n for first n  even numbers :");
		int n=sc.nextInt();
		int a=0;
		while(a<n) {
			System.out.println(2*a);
			a++;
	}
	//2.multiplication table of a given number n.
		System.out.print("Enter your number n_ for multiplication table :");
		int n_=sc.nextInt();
		int b=1;
		int c=10;
		while(b<=c) {
			System.out.println(n_+"*"+b+"="+n_*b);
			b++;
		}
	//3.multiplication table of 10 in reverse order.
		int table=10;
		int y=10;
		System.out.println("multiplication table of 10 in reverse order :");
		while(y>=1) {
			System.out.println(table+"*"+y+"="+table*y);
			y--;
		}
	//4.repeat 5 using while loop.
		int num=0;
		while(num<5) {
			System.out.println(5);
			num++;
		}
	//5.repeat 1 using while loop.	
		System.out.println("Enter your num1 to repeat 1 : ");
		int num1=sc.nextInt();
		int num_2=0;
		while(num_2<num1) {
			System.out.println(1);
			num_2++;
		}
	//6.calculate the sum of the numbers occuring in the table 8.
		int k=8;
		int sum=0;
		for(int i=1;i<=10;i++) {
			int product=k*i;
			System.out.println(k+"*"+i+"="+product);
			sum+=product;
		}
		System.out.println("sum of the numbers on the table ="+sum);
	//7.repeat 2 using for loop.
		System.out.print("Enter your number to repeat 2 in loop :  ");
		int take=sc.nextInt();
		for(int i=1;i<=take;i++) {
			System.out.println(2);
		}
	}
}
