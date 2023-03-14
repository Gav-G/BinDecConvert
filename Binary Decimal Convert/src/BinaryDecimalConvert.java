import java.util.*;
public class BinaryDecimalConvert {
	public String decimalToBinary(long dec) {
		String bin = "";
		for(long num = dec; num != 0; num=num/2) {
			bin = (num%2)+bin;
		}
		return bin;
	}
	public String binaryToDecimal(String bin) {
		long dec = 0;
		int pow = 0;
		for(int i=bin.length()-1; i>=0; i--) {
			dec +=Math.pow(Integer.parseInt(String.valueOf(bin.charAt(i)))*2, pow);
			if(bin.charAt(i)=='0' && pow == 0) {
				dec = 0;
			}
//			System.out.println(String.valueOf(bin.charAt(i)) + " "+dec +" "+pow);
			pow++;
		}
		return Long.toString(dec);
	}
}