
public class PolyandEncapsulation {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a=10 ,b=20;
		
//		void sum()
//		{
//			System.out.println(a+b);
//		}
//		
//		void sum(int x, int y)
//		{
//			
//			
//		}
	
	//Encapsulation
	private int accno;
	private String name;
	private double amount;
	

//	void setAccount(int accno)
//	{
//		this.accno=accno; //refer to class variable
//	}
//	
//	int getAccount()
//	{
//		return accno;
//	}


//source -->click geter seter
public int getAccno() {
	return accno;
}


public void setAccno(int accno) {
	this.accno = accno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getAmount() {
	return amount;
}


public void setAmount(double amount) {
	this.amount = amount;
}


public static void main(String[] args) {

	PolyandEncapsulation pp=new PolyandEncapsulation();
pp.setAccno(100);
int number =pp.getAccno();
System.out.println(number);
//	
	
}
}



