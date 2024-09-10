package Exceptions;

import java.util.Scanner;

public class HandleExctrychath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program satred..");

		Scanner sc=new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter number..");
		int num=sc.nextInt();
		try {
				
		System.out.println(100/num); //100/0 arithmatic exceptons
	
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Invalid data pls enter correct last one");
		}
		
		
	System.out.println("completed.....");
		}
	}

	

