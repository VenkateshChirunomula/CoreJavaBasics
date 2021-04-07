package practice;

import java.util.Arrays;

public class ReverseAWordInAString {
	
	public static void main(String []args)
	{
		String str = "I am Venkatesh Chirunomula , Programming is good";
		
		
		
		String[] split = str.split(" ");
		System.out.println(split[5]);
		
		String newString = split[5];
		String ReveredString ="";
		
		for(int i =newString.length()-1; i >=0; i--) {
			
			ReveredString = ReveredString+newString.charAt(i);
		}
		
		System.out.println(ReveredString);
		
		split[5]= ReveredString;
		
		System.out.println(Arrays.toString(split));
		
	}

}
