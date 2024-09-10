package JavaAndStringPrograms;

import java.util.Arrays;

public class SecondlargeandSecondsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] In= {1,4,5,6,4,34};
		int num=In.length;
		Arrays.sort(In);
		System.out.println("second largest number ="+In[num-2]);
		System.out.println("second smallest number ="+In[1]);
	}

}
