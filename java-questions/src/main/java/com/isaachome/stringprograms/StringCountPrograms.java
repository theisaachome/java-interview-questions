package com.isaachome.stringprograms;

public class StringCountPrograms {
	public static void main(String[] args) {
		countVowelConsonant();
	}
	private static boolean isVowel(char data) {
		return (data=='a' ||
				   data=='e' ||
				   data=='i' ||
				  data=='o' ||
				   data=='u' )? true :false;
	}
	public static void countVowelConsonant() {
		String str = "abce   ";    
		int vCount =0,cCount=0;
		for(int i=0;i<str.length();i++) {
			str = str.toLowerCase().trim();
			if(isVowel(str.charAt(i))) {
				vCount++;
			}else {
				cCount++;
			}
		}
		System.out.println("Total Vowel : " + vCount);
		System.out.println("Total Constants : " + cCount);
	}
}
