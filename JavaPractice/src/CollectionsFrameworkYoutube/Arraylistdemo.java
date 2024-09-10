package CollectionsFrameworkYoutube;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		
	//	ArrayList<String> as=new ArrayList<>();  //we have to store only string value like homogeneous 
		//ArrayList<Employee> as=new ArrayList<Employee>(); we can give another class object also .
		
		ArrayList list=new ArrayList();  //with this object we can store hetrogenousdata 
		list.add(100);
		list.add(100);
		list.add(100.2);
		list.add("well");
		list.add("come");
		list.add(null);
		list.add(null);
		list.add(true);
		
		System.out.println("size of an arry list="+list.size());
		System.out.println(list);
		
		//remove 
		list.remove(5);
		System.out.println(list);
		System.out.println("size of an arry list after remove="+list.size());
		
		//insert elemnt
		list.add(3, "wellcome");
		System.out.println(list);
		System.out.println("size of an arry list after insert="+list.size());
		
		
		//modify /change/replace
		list.set(4, "sagar");
		System.out.println(list);
		System.out.println("size of an arry list after modify="+list.size());
		
		//extract element
		list.get(3);
		System.out.println(list.get(3));
		
		//reading data or element from the arraylist
		
		System.out.print("....for loop......,,,,,,");
		//For loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
      //For each
		
//		for(Object x:list)
//		{
//			System.out.println(x);
//		}
		System.out.print("....Iterator......,,,,,,");
		
	Iterator it	=list.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	System.out.print("....remove starts......,,,,,,");	
	
	//remove multiple value from array by addin value to new array
	ArrayList mylist=new ArrayList();
	mylist.add(100);
	mylist.add("sagar");
	
list.removeAll(mylist);
	System.out.println(list);
	
	}

}
