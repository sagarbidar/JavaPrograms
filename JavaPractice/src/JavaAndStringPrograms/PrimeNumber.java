package JavaAndStringPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Input = 31, Output = The number is prime.
		
		int num=31;
		int count=0;
		if(num<=1)
		{
			System.out.println("the number is not prime");
			return;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			
				count++;
			}
		if(count>1)
		{
			System.out.println("the number is not prime");
		}else {
			System.out.println("this is prime nume");
		}
		
}
}
