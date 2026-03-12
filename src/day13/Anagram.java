package day13;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="LISTEN";
		String str2="silent";
		char[]arr1=str1.toUpperCase().toCharArray();
		Arrays.sort(arr1);
		
		char[]arr2=str2.toUpperCase().toCharArray();		
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("Anagram");
		else		
			System.out.println("Not anagram");
		
		

	}

}
