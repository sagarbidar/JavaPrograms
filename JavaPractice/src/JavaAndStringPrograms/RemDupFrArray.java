package JavaAndStringPrograms;

public class RemDupFrArray {

	public static void main(String[] args) {
		String[] Array = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};

		for(int i=0;i<Array.length-1;i++)
		{
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i]==Array[j])
				{
					System.out.println(Array[i]);
				}
			}
		
	//System.out.print(Array[i]+" ");
	}
	}
}