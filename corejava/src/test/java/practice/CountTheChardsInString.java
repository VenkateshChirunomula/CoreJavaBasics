package practice;

public class CountTheChardsInString {

	public static void main(String[] args) {

		String str="venkatesh chirunomula , test automation engineer ";
		countChars(str, ' ');
	}

	public static void countChars(String str , char val)
	{
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==val)
				count++;
		}
		System.out.println(count);
	}
}
