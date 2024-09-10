package Operators;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Arithmetic operator + - * / %
//	int	a=50;
//	int	b=20;
//	
//	System.out.println("sum of a and b is:"+(a+b));
//	System.out.println("diff of a and b is:"+(a-b));
//	System.out.println("multi of a and b is:"+(a*b));
//	System.out.println("divison of a and b is:"+(a/b));
//	System.out.println("module divison of a and b is:"+(a%b)); //reminder 
//	
//	System.out.println("Arithmatic operaator end..........");
//		//2.Relational /comparison < <= > >= != ==
//	//retruns boolean value ==true/false
//	
//	System.out.println(a>b);
//	System.out.println(a>=b);
//	System.out.println(a<b);
//	System.out.println(a<=b);
//	System.out.println(a!=b);
//	System.out.println(a==b);
//	
//	System.out.println("Relation operaator end..........");
//	//3. logical operator : &&(and) ||(or) !
//	//retrun boolean values
//	
//	boolean x=true;
//	boolean y=false;
//	System.out.println(x && y);
//	System.out.println(x || y);
//	System.out.println(!x);
//	System.out.println(!y);
//	System.out.println(x && y || x);
//	
//	System.out.println(x || y && x);
//	
	
	//4. Increamnet and decrement operator : ++ --
	
	//case 1	
	int n=10;
	//++n;
	n++; //11
	System.out.println(n);
	
	//case 2 :post increment 
	int z=10;
	int res=z++;  //1st will assign so here res will be 10
	System.out.println(res);
	System.out.println(z);  //here z will become 11
	
	//case 3: pre -incremenent operator
	int a=20;
	int res1=++a; 
	System.out.println(res1);
	System.out.println(a); 
	
	}

}
