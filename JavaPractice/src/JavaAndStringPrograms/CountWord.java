package JavaAndStringPrograms;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input = ”Java”, Output = 2
		
		String sg="Java is a programming language. Java java is widely used in software Testing";
		String[] words=sg.toLowerCase().split(" ");
		String word="java";
		int countoccurance=0;
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equalsIgnoreCase(word))
			{
				countoccurance++;
			}
		}
		System.out.println(countoccurance);

	}

}