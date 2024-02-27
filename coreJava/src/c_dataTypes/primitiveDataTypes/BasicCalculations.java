package c_dataTypes.primitiveDataTypes;

public class BasicCalculations {
	public static void main(String[] args) {
		short shortNum = 32242;
		byte byteNum = 127;
		float floatNum = 2.1234567f;
		double doubleNum = 2334.12345678901234;
		
		int sum = shortNum + byteNum;
		float modulo = shortNum % byteNum;
		double sub = doubleNum - floatNum;
		int mul = byteNum * shortNum;
		float div = shortNum / byteNum;
		boolean booleanValue = (sum < mul);
		
	
		System.out.println("\nSum of Short and Byte value(Value in int) : " + sum);
		System.out.println("\nRemainder of Short by Byte(Value in float) :" + modulo);
		System.out.println("\nSubstracting Double and Short(Value in double) : " + sub);
		System.out.println("\nMultiplying Byte and Short(Value in int) : " + mul);
		System.out.println("\nDividing Short by Byte(Value in float) : " + div);
		System.out.println("\nSum is Greater than Mul?(Value in boolean) : " + booleanValue );
		
	}
}
