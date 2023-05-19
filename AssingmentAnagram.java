package week2.day4;
import java.util.Arrays;

public class AssingmentAnagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			char[] charArray=text1.toCharArray();
			char[] charArray2=text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			boolean anagramequal=Arrays.equals(charArray,charArray2);
			if(anagramequal) {
				System.out.println("condition satisfied");
				
			}
			else {
				System.out.println("its not satisfied");
			}
		}

	}

}
