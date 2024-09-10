import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccaranceOfeachCharacter {

	public static void main(String[] args) {
//		Input = "This is an example";
//		Output = p = 1, a = 2, s = 2, T = 1, e = 2, h = 1, x = 1, i = 2, l = 1, m = 1, n = 1

   String Input = "This is an example";
   char[] cr=Input.toCharArray();
   
   HashMap<Character , Integer> count=new HashMap<Character , Integer>();
                      
   for(char c:cr)
   {
	   if(count.containsKey(c))
	   {
		   count.put(c, count.get(c)+1);
	   }
	   else
	   {
		   count.put(c ,1);
	   }
   }
   for(Map.Entry entry:count.entrySet())
   {
	   System.out.println(entry.getKey()+"="+entry.getValue());
   }
	}

}
