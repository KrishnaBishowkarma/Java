package c_dataTypes.referenceDataTypes;

public class StringReferenceDataType {
	public static void main(String[] args) {
	String str1 = "Hello Nepal,";
	String str2 = "Namaste!";
	
	// Concatenating Strings
	String concatenated = str1 + " " + str2;
	
	// Getting the length of the String
	int lengthOfStr = concatenated.length();
	
	// Accessing characters at specific indices
	char firstChar = concatenated.charAt(0);
	char lastChar = concatenated.charAt(lengthOfStr -1);
	
	// Checking if a string contains a substring
	boolean containsNamaste = concatenated.contains("Namaste!");
	
	// Finding the index of a specific character or substring
	int indexOfNepal = concatenated.indexOf("Nepal");
	
	// Extracting Substrings
	String subString = concatenated.substring(3,6);
	
	// Converting a string to Upper case or Lower case
	String lowerCase = concatenated.toLowerCase();
	String upperCase = concatenated.toUpperCase();
	
	// Printing the result
	System.out.println("Concatenated String : " + concatenated);
	System.out.println("Length of Concatenated Strings : " + lengthOfStr);
	System.out.println("First Character : " + firstChar);
	System.out.println("Last Character : " + lastChar);
	System.out.println("Contains 'Namaste'? : " + containsNamaste);
	System.out.println("Index of 'Nepal' : " + indexOfNepal);
	System.out.println("Substring : " + subString);
	System.out.println("Lowercase : " + lowerCase);
	System.out.println("Uppercase : " + upperCase);

	}
}
