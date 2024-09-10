import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniaueArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



List<String> list = Arrays.asList("John", "Mary", "John", "Leeds", 
null, "", "A", "B", "C", "D", "A", "A", "B", "C", "", null);
 
// collect distinct without duplicates
List<String> distinctElements = list.stream()
                        .distinct()
                        .collect(Collectors.toList());
 
// unique elements
System.out.println(distinctElements);
}}