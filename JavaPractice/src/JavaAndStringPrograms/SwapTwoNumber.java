package JavaAndStringPrograms;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		//1. Using Two Variables
		int a=10;
		int b=20;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("swap the two number for a and b is done  "+"a="+a+" b="+b);

		//2. Using Three Variables
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swiping the value, "+"a="+a+" b="+b);
		
		/// 3. Swapping a and b using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swiping the value, "+"a="+a+" b="+b);
		
	}

}
