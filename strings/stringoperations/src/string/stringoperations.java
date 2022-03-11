package string;

public class stringoperations {

	public static void main(String[] args) {
		String S="Java string poll refers to collection of atrings which are stored in heap memory";
		System.out.println("String in lower case:"+S.toLowerCase());
		System.out.println("String in upper case:"+S.toUpperCase());
		System.out.println("String replacing:"+S.replace('a','$'));
		System.out.println("String contains:"+S.contains("collections"));
		System.out.println("String matches:"+S.matches("Java string poll refers to collection of atrings which are stored in heap memory"));
		System.out.println("Strings are equal:"+S.equalsIgnoreCase("Java string poll refers to collection of atrings which are stored in heap memory"));
		

	}

}
