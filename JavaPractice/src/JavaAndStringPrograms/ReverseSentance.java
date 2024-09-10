package JavaAndStringPrograms;

public class ReverseSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input = "India is country My"
//				Output = "My country is India"
		
		String input="India is my country";
		String[] word=input.split(" ");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i]+" ");
		}
		}}