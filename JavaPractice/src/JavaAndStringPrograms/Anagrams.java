package JavaAndStringPrograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
//		        Input =
//				String str1 = "Army";
//				String str2 = "Mary";
//				Output = army and mary are anagram
		String str1 = "Arymy";
		String str2 = "Mary";
		String ab=str1.toLowerCase();
		String bc=str2.toLowerCase();
		if(ab.length()==bc.length())
		{
			char[] exp=ab.toCharArray();
			char[] act=bc.toCharArray();
			Arrays.sort(exp);
			Arrays.sort(act);
	boolean	result=Arrays.equals(act, exp);
	System.out.println(Arrays.equals(exp, act));
	System.out.println(result);
	if (result==true) {
		System.out.println(str1 + " and " + str2 + " are anagram.");
		} else {
		System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
		}}}