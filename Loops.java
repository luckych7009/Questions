package Questions;

public class Loops {

	public static void main(String[] args) {
	//1. Print numbers from 1 to 10 using a for loop.
		int a=1;
		System.out.println("Numbers from 1 to 10 : ");
		while(a<=10) {
			System.out.println(a);
			a++;
		}
	//2. Print numbers from 10 to 1 using a for loop.
		int b=10;
		System.out.println("Numbers from 10 to 1 : ");
		while(b>=1) {
			System.out.println(b);
			b--;
		}
	//3. Print even numbers from 1 to 20 using a for loop.
		int c=1;
		System.out.println("even numbers from 1 to 20 : ");
		while(c<=20) {
			if(c%2==0)
			System.out.println(c);
			c++;
		}
	//4. Print odd numbers from 1 to 20 using a for loop.
		int d=1;
		System.out.println("odd numbers from 1 to 20 :");
		while(d<=20) {
			if(d%2!=0) 
				System.out.println(d);
				d++;
		}
	//5.Print the sum of numbers from 1 to 10.
				int sum=0;
				for(int i=1;i<=10;i++) {
					sum+=i;
				}
					System.out.println("Sum of numbers from 1 to 10 : "+sum);
//6. Print the product of numbers from 1 to 10.			
					int product=1;
					for(int e=1;e<=10;e++) {
						product*=e;
					}
					System.out.println("Product of numbers from 1 to 10: "+product);
		}
}
