
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario 1 like non premitive to premitive like string to int 
		
//		String s="well come"; //can't convert to int
		String s1="1234";
		String s2="5678";
		int ss=Integer.parseInt(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); 
		//if print without converting in to Integer then i will concatinate 
		//12345678

		
		// 2.Scenario like premitive to string like int to string
		//String.vlaueOf();
		int a=10;
		double d=10.5;
		char c='a';
		boolean bol=true;
		
		//one method multiple 
		String s=String.valueOf(a);
		System.out.println(s);
		
	}

}
