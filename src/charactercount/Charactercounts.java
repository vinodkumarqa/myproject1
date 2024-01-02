package charactercount;

public class Charactercounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="Am not a very good boy";
		int wordCount= countWords(sentence);
		System.out.println("The number of words in the sentence is: "+ wordCount);
		

	}

	private static int countWords(String sentence) {
		// TODO Auto-generated method stub
		if(sentence==null|| sentence.trim().isEmpty()) {
			return 0;
		}
		String[]words = sentence.split("\\s+");
		return words.length;
	}

}
