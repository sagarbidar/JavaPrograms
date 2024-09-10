package JavaAndStringPrograms;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String space="sagar man do the work@ @";

String Input=space.replaceAll("\\s","");

System.out.println(Input);


String str1 = "Hello";
String str2 = "World";
String str = str1.concat(", ").concat(str2).concat("!");
System.out.println(str);
	}

}