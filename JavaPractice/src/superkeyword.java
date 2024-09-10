
class hero
{
	String colr="black";
	int x=100;
	void displaycolr()
	{
		System.out.println(x);
	}
}

class man extends hero
{
	String colr="green";
	
	void displaycolr()
	{
		System.out.println(colr);
		System.out.println(super.colr);
		super.displaycolr();
	}
	
	
}


public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		man m=new man();
		m.x=200;
		m.displaycolr();
		
	}

}
