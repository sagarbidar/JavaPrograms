import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDublicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String sg="sagar bheaaar";
		int count;
		char[] string=sg.toCharArray();
		
		for(int i=0;i<string.length;i++)
		{
			count=1;
		for(int j=i+1;j<string.length;j++)
		{
			if(string[i]==string[j] && string[i] !=' ')
			{
				count++;
				string[j]='0';
			}
		}
		
		if(count>1 && string[i]!='0')
		{
			System.out.println(string[i]);
		}*/
		
		
		//2 nd program
//		String string1 = "Great responsibility";    
//        int count;    
//         //  String string2[] =string1.split(" ");
//        //Converts given string into character array    
//        char string[]= string1.toCharArray();    
//            
//        System.out.println("Duplicate characters in a given string: ");    
//        //Counts each character present in the string    
//        for(int i = 0; i <string.length; i++) {    //g
//            count = 1;    
//            for(int j = i+1; j <string.length; j++) {    //r
//                if(string[i] == string[j] && string[i] != ' ') {    //g=r ,
//                    count++;    
//                    //Set string[j] to 0 to avoid printing visited character    
//                    string[j] = '0';    
//                }    
//            }
//            if(count > 1 && string[i] != '0')    
//                System.out.print(string[i]); 
//            
//        }    
//    }    
    
	
	//3rd program
	String string1 = "Geraeat responslity";
    String[] words = string1.split(" ");
    
    List<Set<Character>> duplicatesList = new ArrayList<>();
    
    for (String word : words) {
        Set<Character> chars = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        
        for (char c : word.toCharArray()) {
            if (!chars.add(c)) {
                duplicates.add(c);
                
            }
        }
        
        duplicatesList.add(duplicates);
    //}
    
    // Print the results
   // for (Set<Character> duplicates : duplicatesList) {
        System.out.print(duplicates);
    //}
    }
	}
}
//out put [a , si]
	

	//}

