package JavaAndStringPrograms;

public class Method {

	int sid;     //these all class varibale
	String sname;
	char gd;
int x,y;
	
//	Method(int id,String name,char g){    //parameterized construtor because it's taking 
//		sid=id;
//		sname=name;
//		gd=g;
//		
//	}
	
	//default constructor
	Method()
	{
		x=100;
		y=299;
	}
	
	Method(int a,int b)
	{
		x=a;
		y=b;
	}
	
	Void Sum1()
	{
		System.out.println(x+y);
		return null;	
}

		void m1()
		{
			System.out.println("hello");
		}
		
		String m2()
		{
			return "hello retrun";
		}
		
		void m3(String name)
		{
			System.out.println("hello "+ name);
		}
	
		String m4 (String name1)
		{
			return ("hello retrun"+name1);
		}
		
		void setddata()
		{
			System.out.println(sid+"   "+sname+"  "+gd);
		}
		
		void printstuddata1(int id,String name,char g)  //local variables
		{
			sid=id;
			sname=name;
			gd=g;
			System.out.println(sid+"   "+sname+"  "+gd);
		}
		
	

	}

