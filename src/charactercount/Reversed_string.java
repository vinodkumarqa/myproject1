package charactercount;

public class Reversed_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="marolix";
		String reversedString="";
		for(int i=str.length() -1;i>=0;i--) {
			reversedString=reversedString+str.charAt(i);
		}
		System.out.println("The reversed string of the " + str + " is: ");
		System.out.println(reversedString);

	}

}
