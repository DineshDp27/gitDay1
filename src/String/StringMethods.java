package String;

public class StringMethods {
	public static void main(String[] args) {
		
		String s= "JAVAPROGRAM";
		String s1 = "java program";
//Length		
		int length = s1.length();
		System.out.println(length);
//toUpperCase		
		String upperCase = s1.toUpperCase();
		System.out.println(upperCase);
//toLowerCase
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
//Index of (Case sensitive)
		int indexOf = s1.indexOf('m');
		System.out.println(indexOf);
//last index of
		int lastIndexOf = s1.lastIndexOf('a');
		System.out.println(lastIndexOf);
//Char at
		char charAt = s.charAt(9);
		System.out.println(charAt);
		
//Boolean (Case sensitive)
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
//Boolean equals ignore case (C.S)
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
//Boolean Contains
		boolean contains = s.contains("GRAM");
		System.out.println(contains);
// Replace
		String replace = s1.replace("java", "Dinesh");
		System.out.println(replace);
//Start with
		boolean startsWith = s.startsWith("AVA");
		System.out.println(startsWith);
//Ends with
		boolean endsWith = s1.endsWith("gram");
		System.out.println(endsWith);

		
	}
}
