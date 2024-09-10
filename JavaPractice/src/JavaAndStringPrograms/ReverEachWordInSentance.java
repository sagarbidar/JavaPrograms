package JavaAndStringPrograms;

public class ReverEachWordInSentance {

	//String rv="reverse each word in a string";
	static void reversethestring(String rv)
	{
		
		String[] bond=rv.split(" ");
		String reverseString="";
		for(int i=0;i<bond.length;i++)
		{
			String bonds=bond[i];
			String nstr = ""; 
			char ch;
			for (int j = 0; j < bonds.length(); j++) { 
			ch = bonds.charAt(j);
			nstr = ch + nstr;
			
			
			}
			reverseString = reverseString + nstr +" ";
			}
		//	System.out.println(rv); 
			System.out.print(reverseString);
			}


	
	public static void main(String[] args) {
//		Input = "reverse each word in a string";
//		Output = "esrever hcae drow ni a gnirts"
		
		String input="reverse each word in a string";	
		String[] word=input.split(" ");

		for(String words:word)
		{
					
StringBuilder s=new StringBuilder(words);
StringBuilder string=s.reverse();
System.out.print(string+" ");

		}
		System.out.println(".................");
		ReverEachWordInSentance ss=new ReverEachWordInSentance();
		reversethestring("this is my county");	}}  