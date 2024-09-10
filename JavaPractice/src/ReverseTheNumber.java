
public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =236;
		int rev1=0;
		
		while(number!=0)
			{
				int remainder=number%10;  //6 //3 //2
				 rev1=rev1*10+remainder;  //6 //3 //2
				
		 number=number/10;  //23 //2
			}
		System.out.println("The reverse of the given number is: " + rev1); 
	}
}//