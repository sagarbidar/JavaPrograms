package JavaAndStringPrograms;

public class LargeNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {2,34,5,6,89,10};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>max)
		
		max=arr[i];}System.out.println("largest number in the given arry"+max);	}}