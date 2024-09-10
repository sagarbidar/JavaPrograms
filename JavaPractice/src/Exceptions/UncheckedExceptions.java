package Exceptions;

import java.util.Scanner;

public class UncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program satred..");

		Scanner sc=new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter number..");
		int num=sc.nextInt();
		System.out.println(100/num); //100/0 arithmatic exceptons
		
		//Example 2
		int a[]=new int[5];
		System.out.println("Enter the position:0-4");
	int pos=sc.nextInt();
		
	System.out.println("Enter value..");
	int value=sc.nextInt();
	a[pos]=value;
		
		System.out.println(a[pos]);
		
		System.out.println("program exited..");
	}

}
