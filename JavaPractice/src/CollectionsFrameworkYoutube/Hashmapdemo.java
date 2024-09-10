package CollectionsFrameworkYoutube;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapdemo {

	public static void main(String[] args) {
		
	//	HashMap hm=new HashMap();
		
		HashMap<Integer , String> hm1=new HashMap<Integer , String>();
		
         hm1.put(101, "sagar");
         hm1.put(102, "man");
         hm1.put(103, "hero");
         hm1.put(103, "yes");
         hm1.put(105, "yash");
         
         System.out.println(hm1);
         
         //remove pair
       System.out.println(hm1.remove(101));
       System.out.println(hm1);
       
       //access value key
       System.out.println(hm1.get(102));
       
       //get all the key frm hashmap
       System.out.println(hm1.keySet());  //only keys
       System.out.println(hm1.values());  //only value
       
       //get key and value along all data will print
       System.out.println(hm1.entrySet());
       
       hm1.put(101, "man");
       System.out.println(hm1);
       
       hm1.put(101, "man1");
       System.out.println(hm1);
       
       //for loop not possible becus of index issue 
       
       ///using for:each
       for(int k:hm1.keySet())
       {
    	   System.out.println(k+"    "+hm1.get(k));
       }
       
       //Using iteration
       System.out.println("Iteration statrts >>>");
       
       Iterator<Entry<Integer , String>> it=hm1.entrySet().iterator();
       while(it.hasNext())
       {
    	   Entry<Integer , String> entry=it.next();
    	   System.out.println(entry.getKey()+"    "+entry.getValue());
       }
       
       hm1.clear();
       System.out.println(hm1.isEmpty());
	}

}
