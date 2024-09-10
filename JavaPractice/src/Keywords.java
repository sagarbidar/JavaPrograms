
public class Keywords {

	int x,y;  //class variables
	static int a=10;
	int b=100;
	 Keywords(int a,int b)
	 {
		 this.x=a;   //this will belongs to class varibales 
		 this.y=b;
	 }
	
	 void disply()
	 {
		 System.out.println(x+"her"+y);
	 }
	
	 
	 static void m1()
	 {
		 System.out.println("this is static method");
	 }
	 
	 void m2()
	 {
		 System.out.println("this is not static method");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Keywords kik=new Keywords(100,200);
//		kik.disply();
		
		System.out.println(a);
		m1();
	}

}
