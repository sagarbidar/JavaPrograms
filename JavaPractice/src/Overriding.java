class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICIC extends Bank
{
	
	double roi()
	{
		return 10.5;
	}
	
}

class SBI extends Bank
{
	
	double roi()
	{
		return 12.5;
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		System.out.println(s.roi());
	}

}
