
public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="abc123de45f6";
		//output =174
		String number=input.replaceAll("abc","").replaceAll("de"," ").replaceAll("f"," ");
		System.out.println(number);
		//number.split(number);
		String[] a=number.split(" ");
		System.out.println(a[0]);
		System.out.println(a[1]);

		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
			
		}
	
		
//		((()) - false
//				()()() - true
//				(())- true

		String s="()";
		String s1="()";
		//String 

		//== :
//		
//		try{
//			//code
//			
//		}
//		catch(Exception e){
//			
//		}
//		catch(NullPointerException e){
//			
//		}
//		
		//funcational interface java 1.8
		try{}
		catch(NullPointerException e){}
		catch(Exception e){}
	}

}
