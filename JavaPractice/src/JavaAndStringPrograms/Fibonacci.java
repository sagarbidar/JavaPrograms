package JavaAndStringPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Input = First 10 Numbers
//				Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
//				The first two numbers of Fibonacci series are 0 and 1
		
int num1=0,num2=1; 
int num=20;

for(int i=0;i<=num;i++)
{
	System.out.print(num1+"  ");
    int num3=num2+num1; // 0 1,
    
     num1=num2;  // 1=1
      num2=num3; //1=1
}
	}

}
