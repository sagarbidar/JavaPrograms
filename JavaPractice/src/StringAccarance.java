
import java.util.HashMap;

public class StringAccarance {

	
		// TODO Auto-generated method stub
public void accarance()
{
		String input="wellcome to the dev";
	
		String ss=input.toLowerCase();
		String ss1=ss.replaceAll("\\s+","");
		
		
		HashMap hs=new HashMap();
		
		
		for(int i=0;i<ss1.length();i++)
		{
			int count=1;
			if(hs.containsKey(ss1.charAt(i)))
					{
				count=(int) hs.get(ss1.charAt(i));
				count++;
				hs.put(ss1.charAt(i),count);
				
					}else {
						hs.put(ss1.charAt(i),count);
					}
		}
		System.out.println(hs);
	
}


public static void main(String[] args) {
	
	StringAccarance sc=new StringAccarance();
	sc.accarance();
}
}
