package JavaAndStringPrograms;

public class WithoutSplit {

	public static void main(String[] args) {
//		Input = "Welcome234To567Java89Programming0@#!!";
//		Output = 
//		WelcomeToJavaProgramming
//		234567890
//		@#!!
	String Input = "Welcome234To567Java89Programming0@#!!";
	StringBuffer alpha=new StringBuffer();
	StringBuffer num=new StringBuffer();
	StringBuffer special=new StringBuffer();
	
	for(i=0;i<Input.length();i++)
		{
		if(Character.isDigit(Input.charAt(i)))
				num.append(Input.charAt(i));
		else if (Character.isAlphabetic(Input.charAt(i))
			alpha.append(Input.charAt(i));
else
	special.append(Input.charAt(i))
	}System.out.println(alpha);
	System.out.println(num);
	System.out.println(special);}}