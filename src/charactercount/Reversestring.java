package charactercount;

public class Reversestring {

	private static String input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="welcome to marolix technologies";
		String reversedString=reversedWords(inputString);
		System.out.println("Original String: "+ inputString);
		System.out.println("String with reversed words: "+ reversedString);

	}

	private static String reversedWords(String inputString) {
		// TODO Auto-generated method stub
		String[] words = input.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for(int i = words.length - 1;i>=0;i--) {
			reversed.append(words[i]).append(" ");
		}
		
		return reversed.toString().trim();
	}

}
