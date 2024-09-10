
interface shape
{
	int length=100; //static and final
	int width=20; //static and final
	
	void abstract1(); //abstract method //public 
	
	default void squre()  //default method
	{
		System.out.println("this is deafault method in interface");
	}
	
	static void rectangle()  //static method
	{
		System.out.println("this is static method in interface");
	}
	
}


public class Interfacedemo implements shape {

	@Override
	public
	void abstract1() {
		System.out.println("abstract methid");
		
	}
	
	void triangle() {
		System.out.println("this is child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scenario 1
		Interfacedemo Interfacedemo = new Interfacedemo();
		//if
		Interfacedemo.squre();
		Interfacedemo.abstract1();
		shape.rectangle();
		Interfacedemo.triangle();
		
		//Scenario 2
		shape ss=new Interfacedemo();
		System.out.println(shape.length);
		ss.squre();
		ss.abstract1();
		shape.rectangle();
		//ss.triangle()// we can't access child cls method by parent object
	}

	

}
