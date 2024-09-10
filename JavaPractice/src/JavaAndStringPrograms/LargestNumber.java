package JavaAndStringPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=7 ,num2=10 ,num3=8;
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println(num1+" is the large number");
		}
		
		else if(num2>=num1 && num2>=num3)
		{
		System.out.println(num2+" is the large number");
		}
		else
			System.out.println(num3+" is the large number");
		
		ArrayList<Integer> as=new ArrayList<Integer>();
		as.add(20);
		as.add(10);
		as.add(30);
		System.out.println((Collections.max(as)+"is the largest number"));
		
}
}
