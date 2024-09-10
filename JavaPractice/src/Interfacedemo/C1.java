package Interfacedemo;

public class C1 extends C2 implements L1,L2
{
	
	
	public void m2() {
		
		System.out.println(x);
	}

	
	public void m1() {
		System.out.println(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 obj=new C1();
		obj.m1();
		obj.m2();
		obj.m3();
	}

	

}
