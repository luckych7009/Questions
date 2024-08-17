package Questions;
import java.util.Scanner;
public class For_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
/*	//1. Write a Java program to print the elements of an array.	
		int number[]=new int[6];
		System.out.print("Enter element :"); number[0]=sc.nextInt();
		System.out.print("Enter element :"); number[1]=sc.nextInt();
		System.out.print("Enter element :"); number[2]=sc.nextInt();
		System.out.print("Enter element :"); number[3]=sc.nextInt();
		System.out.print("Enter element :"); number[4]=sc.nextInt();
		System.out.print("Enter element :"); number[5]=sc.nextInt();
int x=6;
//Using for loop......
for(int i=0;i<x;i++) {
	System.out.println("Elements are : "+number[i]);
}
int k=0;
//Using while loop.....
while(k<6) {
	System.out.println(number[k]);
	k++;
}
int l=0;
//Using do-while loop.....
do {
	System.out.println(number[l]);
	l++;
}while(l<6);*/

//2. Write a Java program to print the sum of the elements of an array.
int arr[]=new int[5];
System.out.print("Enter elements of arr :");arr[0]=sc.nextInt();
System.out.print("Enter elements of arr :");arr[1]=sc.nextInt();
System.out.print("Enter elements of arr :");arr[2]=sc.nextInt();
System.out.print("Enter elements of arr :");arr[3]=sc.nextInt();
System.out.print("Enter elements of arr :");arr[4]=sc.nextInt();
int sum=0;
int m=5;
for(int y=0;y<m;y++) {
	System.out.println("Elements are: "+arr[y]);
	sum+=arr[y];
}
System.out.println("The sum of elements of arr :"+sum);
 

	}

}
