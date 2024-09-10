package Typecasting;

class Parent{
	
String s="john";

void m1()
{
	System.out.println("this is parent imp...");
}
}


class child extends Parent {
	
int n=100;


void m2()
{
	System.out.println("this is child imp...");
}
}


public class Typecastingobject1 {

	public static void main(String[] args) {
		
		//Typecastingobject1 tp=new Typecastingobject1();
		
		//with child class object we can access all fromparent and child
		child c=new child();
		System.out.println(c.s);
		c.m1();
		System.out.println(c.n);
		c.m2();
		
		//upcasting --p referance variable and child object and assigning child to parent (small to large)
		Parent p=new child();  //with this just we can access from parent 
		System.out.println(p.s);
		p.m1();
		//System.out.println(p.n); //cannot access 
		//p.m2();  // cannot access
		
		//Down casting //large to small
		child c1=(child) p;  //with down casting will access all from parent and child
		
		System.out.println(c1.s);
		c1.m1();
		System.out.println(c1.n);
		c1.m2();  //while run will will get error for down casting
	}

}
