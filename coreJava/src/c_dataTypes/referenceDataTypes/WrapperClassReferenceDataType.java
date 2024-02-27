package c_dataTypes.referenceDataTypes;

public class WrapperClassReferenceDataType {
	    public static void main(String[] args) {
	    	// Example using Integer wrapper class
	        Integer intValue = Integer.valueOf(10); // Boxing: converting int to Integer
	        System.out.println("Integer value: " + intValue);

	        // Example using Double wrapper class
	        Double doubleValue = 3.14; // Autoboxing: automatically converting double to Double
	        System.out.println("Double value: " + doubleValue);

	        // Example using Character wrapper class
	        Character charValue = 'A'; // Autoboxing: automatically converting char to Character
	        System.out.println("Character value: " + charValue);

	        // Example using Boolean wrapper class
	        Boolean boolValue = Boolean.TRUE; // Autoboxing: automatically converting boolean to Boolean
	        System.out.println("Boolean value: " + boolValue);

	        // Unboxing: converting Integer to int
	        int intValueUnboxed = intValue.intValue();
	        System.out.println("Unboxed integer value: " + intValueUnboxed);

	        // Autounboxing: automatically converting Double to double
	        double doubleValueUnboxed = doubleValue;
	        System.out.println("Unboxed double value: " + doubleValueUnboxed);

	        // Autounboxing: automatically converting Character to char
	        char charValueUnboxed = charValue;
	        System.out.println("Unboxed character value: " + charValueUnboxed);

	        // Autounboxing: automatically converting Boolean to boolean
	        boolean boolValueUnboxed = boolValue;
	        System.out.println("Unboxed boolean value: " + boolValueUnboxed);
	    }
	}


