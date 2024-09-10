package Operators;

public class Assignment {

	public static void main(String[] args) {
		//if you want to increse valure more then 5time or above 2time
		
		// == += -= *= /= %=
		int a=20;
		//a+=5; //add 5 to a 
		
		a-=5;
		System.out.println(a);
		
		//example 2
		int b=30;
		b*=2;
		System.out.println(b);

		//5. conditonal /ternory ? :
		
		//example 1
		int x=20;
				int y=10;
				
				int z=(x>y) ?x:y;  //if it is true condition x value will print if not y value will print 
				System.out.println(z);
				
				// example 2
		int age=18;
		String res=(age>=18)?"eleigible":"not eligible";
	System.out.println(res);
	}

}
