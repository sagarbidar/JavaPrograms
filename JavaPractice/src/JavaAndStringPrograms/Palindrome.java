package JavaAndStringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input = 12321
//				Output =12321
		
		int num=12321;
		int rem, temp=num,rev=0;
		
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			System.out.println("Reversed number is "+rev);
			//rev=rem;
			num=num/10;
			
		}
		System.out.println("Reversed number is "+rev);
		
		if(rev==temp)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
		
	}

}
