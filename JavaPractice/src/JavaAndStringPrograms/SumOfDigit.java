package JavaAndStringPrograms;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input = 987
//		Output = 24
		
		int num=987;
		int rem ,sum=0;
		while(num!=0)
		{
			rem=num%10;;
			sum=sum+rem;
			num=num/10;
		}

		System.out.println("some of number is ="+sum);
	}

}
