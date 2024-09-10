package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(100);
		hs.add(100.2);
		hs.add("well");
		hs.add("come");
		hs.add(null);
		hs.add(null);
		hs.add(true);
		
		System.out.println(hs);
		
		//removing element from set
		hs.remove(100);
		
		//insertion is not possible
		
		//Access specific element ;; not possible
		
		//convert Hashset to array list
		ArrayList al=new ArrayList(hs);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all the element using for: each and noramal for loop we can't use because index
		
		for(Object x:hs)
		{
			System.out.println(x);
		}
		
		
	}

}
