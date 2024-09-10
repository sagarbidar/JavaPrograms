package JavaAndStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceWordfromString {

	public static void main(String[] args) {
//		Input = "Alice is girl and Bob is boy";
//		Output = {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}
		
		String input="Alice is girl and Bob is boy";
		Map<String ,Integer> value=new HashMap<String , Integer>();
		String[] words=input.split(" ");
		for(String word:words)
		{
			if(value.containsKey(word))
		{
			value.put(word, value.get(word)+1);
			
			
		}
			else
			{
				value.put(word, 1);
			}
			System.out.println(value);
			
}
		}
}