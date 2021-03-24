package logical_builing;

public class Decimal2Hex_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 9134780;
		System.out.println(decimal2hex_octal(input));

	}
	public static String decimal2hex_octal(int input){
		String ret = "";
		ret = Integer.toHexString(input).toUpperCase() + ": " + Integer.toOctalString(input);
		return ret;
	}

}
