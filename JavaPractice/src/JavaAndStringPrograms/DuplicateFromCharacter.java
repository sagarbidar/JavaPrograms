package JavaAndStringPrograms;

public class DuplicateFromCharacter {

	public static void main(String[] args) {
//		Input = "apple is fruit";
//		Output = p i

		String s="apple is fruits";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
			{
			for(int j=i+1;j<s.length();j++)
				{
				if(ch[i]==ch[j])
					{
					System.out.print(ch[i]);
					}}}}}