package JavaAndStringPrograms;

public class CountInteger {

	//1. using while loop
	//Input = 29845315, Output = 8
	public static void main(String[] args) {
		int n=29845315;
		int count=0;
		int num2 = 29845315;
		
		while(n!=0)
		{
			n=n/10;
			System.out.println(n);
			count++;
			
		}
		System.out.println("number of digit:"+ count);
		
//2.Converting given number to string solution to count digits in an integer
		String result=Integer.toString(num2);
		System.out.println(result);
		System.out.println(result.length());
	}

}
