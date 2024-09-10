
public class Reversethestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sg="sagar";
		char[] input=sg.toCharArray();
		//System.out.println(input);
		
		for(int i=input.length-1;i>=0;i--)
		{
			System.out.print(input[i]);
						
	}
		StringBuffer sbr=new StringBuffer(sg);
		sbr.reverse();
		System.out.println(sbr);

}
}
