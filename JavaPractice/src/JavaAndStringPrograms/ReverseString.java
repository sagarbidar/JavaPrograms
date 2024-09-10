package JavaAndStringPrograms;

public class ReverseString {
	//String s="i am a Tester";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1
		String s="i am a Tester";
		String rev="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
			//System.out.print(s.charAt(i));
		}
				
		System.out.println(rev);
		
		////Approach2 without using string method 
		String s1="i am a Tester";
		String rev1="";
		char a[]=s1.toCharArray();    //stroe the value o,1,2,3 index arry box
		
		for(int i=a.length-1; i>=0;i--)
		{
			rev1=rev1+a[i];
			
		}
		System.out.println(rev1);
		
		//Approach3 String buffer and string builder
		//String s2="i am a Tester";
		//s2.concat("wellcome"); in string we don't have append
		//System.out.print( s2);  imutable
		
		StringBuilder sb=new StringBuilder("wellcome");
		//StringBuffer sf=new StringBuffer(s2);
		//sb.reverse();
		//System.out.print( sb.reverse());
		
		sb.append("sagar24354365587");  //append will used for concat in strig buffer and string builder so it will mutable
		System.out.println( sb);
		
		//Chceck given string is Palindrome string
		//String sg="MADAMsdfg";
		String sg="343";
		String Temp="";
		
		
		for(int i=sg.length()-1;i>=0;i--)
			
		{
			
			Temp=Temp+sg.charAt(i);
		
		}
		System.out.println(Temp);
		if(Temp.equalsIgnoreCase(sg))
			{
				System.out.println("givem string is palindrome");
			}
			else
			{
			System.out.println("given string is not palindrome");
		}
		
		/// remove the junk char from the string
		String vm="@#$dff5";
	vm=vm.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(vm);
		
		//remove the spaces from the string
		String vm1="w w w w e e ";
		vm1=vm1.replace(" ", "");
		
		System.out.println(vm1);
		
		
		//count letter repeated
		String repeate="ababababaccgg";
		
		int count=0;
		
		
		}
	}


	
	
 
	
	

