package JavaAndStringPrograms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComanElementFrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input = array1 = { 4, 2, 3, 1, 6 }; array2 = { 6, 7, 8, 4 };
//		Output = 6,4
		
//		Integer[] array1= {2,3,4,5,6,78};
//		Integer[] array2= {4,2,3,9,8};
		
		Integer[] array1 = { 4, 2, 3, 1, 6 };
		Integer[] array2 = { 6, 7, 8, 4 ,6 };

		
		//List<Integer> commonElements = new ArrayList<>();
		Set<Integer> commonElements = new HashSet<Integer>();
		for(int i=0;i<=array1.length-1;i++)
		{
			for(int j=0;j<=array2.length-1;j++)
			{
				if(array1[i]==array2[j])
				{
					commonElements.add(array1[i]);
				}
				
			}		
	
		System.out.println(commonElements);
		}
		
	
		//2.by using ArrayList with retainAll method
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
		list1.retainAll(list2);
		System.out.println("Common Elements:" + list1);
		
		//3.
		
//		String[] array3 = { "Java", "JavaScript", "C", "C++" };
//		String[] array4 = { "Python", "C#", "Java", "C++" };
//		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(array3));
//		ArrayList<String> list4 = new ArrayList<>(Arrays.asList(array4));
//		List<String> commonElements1 = 
//		list3.stream().filter(list4::contains).collect(Collectors.toList());
//		System.out.println(commonElements1);
		} 
	
}
