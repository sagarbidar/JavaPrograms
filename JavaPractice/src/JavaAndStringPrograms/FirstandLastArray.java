package JavaAndStringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstandLastArray {

	public static void main(String[] args) {
		
//		Input = array1 = { 4, 2, 3, 1, 6 };
//		Output = First is:4, Last is: 6
		Integer[] array1 = { 4, 2, 3, 1, 6 };
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(array1));
		//ArrayList<Integer> list=new ArrayList<Integer>();
		
		//Set<Integer> list=new HashSet<Integer>();
//		list.add(2);
//		list.add(3);
//		list.add(10);
//		list.
		int first=list.get(0);
		System.out.println(first);
		int last=list.get(list.size()-1);
		System.out.println(last);
		

	}}

