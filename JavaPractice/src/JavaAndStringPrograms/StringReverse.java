package JavaAndStringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String s="Sagar Man";
		
		//1. using ChatAt
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char s1=s.charAt(i);
//			System.out.print(s1);
//		//	System.out.println(s.charAt(i));
//		}
		
//		//2. Using for toChar Array
		
		String man="this is testing";
		char[] ch=man.toCharArray();
		String rev ="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}
		System.out.print(rev);
		
		//3. using string builder or string buffer 
		
		String input="Test again";
		
		StringBuilder sb=new StringBuilder();
		sb.append(input);
		sb.reverse();
		System.out.println(sb);

		
		//4.or string buffer 
		
		String strText = "Java Learning";
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(strText);
		sbr.reverse();
		System.out.println(sbr);
	}
}
