
public class DublicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = new int [] {3,4,4,5,5,6,6};
	    //int count=0;
		
		for(int i=0;i<arr.length;i++)
		 for(int j=i+1;j<arr.length;j++)
		{
			 if(arr[i]==arr[j])
			 {
				
			System.out.println(arr[j]);						 
	}
		
	}
	

	}
}
