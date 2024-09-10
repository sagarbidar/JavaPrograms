package JavaAndStringPrograms;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//case1
		String s1="wellcome";
		String s2="wellcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
		//case2
		String s3=new String("wellcome");  //new will be used to create a object
		String s4=new String("wellcome");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		//case3
		
		String s5="wellcome"; 
		String s6=new String("wellcome");
		
		
		System.out.println(s5==s6);//false
		System.out.println("s5 and s6"+s5.equals(s6));//true
		
		//case4
		
		String s7="wellcome"; 
		String s8=new String("wellcome");
		String pp=s8;
		
		
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8));  //true
		
		System.out.println(s8==pp);  //true  because both object are same
		System.out.println(s8.equals(pp));  //true
		
		
	}

}
