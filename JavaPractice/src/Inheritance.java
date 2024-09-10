class A
{
	int a=10;
	void show() {
		
		System.out.println(a);	
	}
	
}

class B extends A
{
	int b=30;
	
	void show()
	{
		System.out.println(b);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B bb=new B();
bb.show();
//bb.disply();
	}

}
