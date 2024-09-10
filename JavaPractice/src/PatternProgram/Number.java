package PatternProgram;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Program 1
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numbe ro rows to be printted ");
//		int n=sc.nextInt();
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//Program 2
//	    4
//	  3 4
//	2 3 4
//1 2 3 4
		
		
		
		int n=5;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numbe ro rows to be printted ");
//		int n=sc.nextInt();
		for(int i=n;i>=1;i--) 
		{
//			for(int k=1;k<i;k++)  //4,4<=3
//			{
//			System.out.print(" ");	
//			}
				
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
		
//		   1 
//		  1 2 
//		 1 2 3 
//		1 2 3 4 
		
	//	int n=4;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numbe ro rows to be printted ");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) 
//		{
//			for(int k=i;k<=n-1;k++)
//			{
//			System.out.print(" ");	
//			}
//				
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
	}

}
