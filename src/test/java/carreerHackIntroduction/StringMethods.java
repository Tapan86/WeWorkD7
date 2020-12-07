package carreerHackIntroduction;

public class StringMethods {

	public static void main(String[] args) {
		
String str= "This is the test String";
		
		String str1="Hello";
		String str2="Hello";
		String str3="Welcome";
		String str4="";
		String str5="   There is some spaces all around     ";
		String str6="Hello";
		
		System.out.println("length of the string is: "+ str.length());
		System.out.println("character At index 2 is: " + str.charAt(2));
		System.out.println(str.concat(" and this is the appended string"));
		System.out.println("contais check 1: " + str.contains("is"));
		System.out.println("contains check 2: "+ str.contains("si"));
		System.out.println("starts with check 1: " + str.startsWith("This"));
		System.out.println("starts with check 2: " + str.startsWith("is"));
		System.out.println("check contents of equal: " + str1.equals(str2));
		System.out.println("check contents of equal: " + str1.contentEquals(str3));
		System.out.println("check index 1: " + str.indexOf('h'));
		System.out.println("check index 2: " + str.indexOf('Q'));
		System.out.println("check string empty: " + str4.isEmpty());
		System.out.println("example of trim: " + str5.trim());
		System.out.println("check replace 1: " + str6.replace('e', 'a'));
		System.out.println("check replace 2: " + str6.replace('l', 'n'));
		
		

	}

}
