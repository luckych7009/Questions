package Questions;

public class question_3 {

	public static void main(String[] args) {
		String name="Lucky chaudhary";
		/*
	    System.out.print("Length of String : ");System.out.println(name.length());
		System.out.print("String in Lowercase : "); System.out.println(name.toLowerCase());
		System.out.print("Replace Lucky with Karan in string : ");System.out.println(name.replace("Lucky", "Karan"));
		System.out.print("String in uppercase : ");System.out.println(name.toUpperCase());
		System.out.print("substring of original string : ");System.out.println(name.substring(6));
		System.out.print("To check String start with given characters : ");System.out.println(name.startsWith("Lu"));
		System.out.print("To check string ends with the given character or not : ");System.out.println(name.endsWith("ky"));
		System.out.print("Substring with starting and ending index : "); System.out.println(name.substring(2,15));
		System.out.print("To check given characters is equal to original string or not :"); System.out.println(name.equals("Lucky chaudhary"));
		System.out.print("For ignoring case : "); System.out.println(name.equalsIgnoreCase("lucky chaudhary"));
		*/
		//Practice set
	System.out.print(" Replace spaces with underscores : "); System.out.println(name.replace(" ", "_"));
System.out.println(" Letter = Dear <|name|> , Thanks a lot.");System.out.print(" Replace <|name|> with a string (some name) : ");
String letter ="Dear <|name|> , Thanks a lot.";
System.out.println(letter.replace("<|name|>", "Lucky chaudhary"));
System.out.println("using escape sequence character :");System.out.println("Dear Harry,\nThis java course is nice.Thanks");

	}
}