package JavaAndStringPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: 153 , Output: Yes
//		153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153
		
		int num=153 ;
		int sum=0 ,res ,temp;
		temp=num;
		
		while(num>0)
		{
			res=num%10;
			
			sum=sum+(res*res*res);		
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+"given number is armstrong");
		}
		else
			System.out.println(temp+"given number is not armstrong");
		}
	}


