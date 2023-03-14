import java.math.BigInteger;
import java.util.*;
public class BinaryDecimalTest {
	public static void main(String[]args) {
		BinaryDecimalConvert converter = new BinaryDecimalConvert();
		Scanner kb = new Scanner(System.in);
		System.out.print("enter a decimal: ");
		long decNum = kb.nextLong();
		String decString;
		System.out.println("converting decimal to binary: " + decNum);
		String binStr = converter.decimalToBinary(decNum);
		System.out.println(decNum+" --> "+binStr);
		System.out.print("enter a binary: ");
		String binNum = kb.next();
		System.out.println("converting binary to decimal: " + binNum);
		decString = converter.binaryToDecimal(binNum);
		System.out.println(binNum+" --> "+decString);
		kb.close();
	}
}
