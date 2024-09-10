package JavaAndStringPrograms;

public class SortArrayWithoutInbuilt {

	public static void main(String[] args) {
//		Input = array[] = { 10, 5, 20, 63, 12, 57, 88, 60 };
//		Output = 5 10 12 20 57 60 63 88

		int array[]= {1,3,4,19,10,34,124};
		int size=array.length;
		int temp ;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					System.out.println(array[i]);
					array[i]=array[j];
					System.out.println(array[j]);
					array[j] = temp;
					System.out.println(temp);
					System.out.println(array[i]);
					System.out.println(array[j]);
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Array sorted: " + array[i]);
		}
		
	}

}
