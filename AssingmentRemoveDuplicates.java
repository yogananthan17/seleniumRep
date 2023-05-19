package week2.day4;



public class AssingmentRemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;
		String result = "";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			for (int j = 0; j < words.length; j++) {
				if (word.equals(words[j])) {
					count += 1;
					if (count > 1) {
						words[j] = "";
					}
				}
			}
			if (!word.equals(" ")) {
				result = result + word + " ";
			}
		}
		System.out.println(result);
	}
}
