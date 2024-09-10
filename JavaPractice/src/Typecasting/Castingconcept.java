package Typecasting;

public class Castingconcept {

	public static void main(String[] args) {

		//upcasting : (automatic) converting smaller to larger value
		//int ---> long
		int value=100;
		long bigvalue=value;
		System.out.println(bigvalue);
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		//downcasting : larger to smaller 
		
		long longvalue=1000;
		int intvalue=(int)longvalue;  //reduc ethe size of value because long is more size compare to int
		System.out.println(intvalue);  
	}

}
