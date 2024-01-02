package charactercount;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Range Rover";
		char a="R";
		int charCount=countCharacter(str, a);
		System.out.println("The character " + a + " is repeated " + charCount + " times in the String" );
		
	}


	private static int countCharacter(String str, char a) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==a) {
				count++;
			}
		}
		return count;
	}

}
