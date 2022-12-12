
public class ExcelSheetNumber {
	public static void main(String[] args) {

		String col = "ZY";
		System.out.println(excelSheet(col));

	}

	private static int excelSheet(String col) {
		// result*26+(ch-'A'+1)
		// AB=> 0*26+1=1, 1*26+2=>28
		// result=0;
		// result=result*26;
		// result=result+ch-'A'+1
		int result = 0;
		for (int i = 0; i < col.length(); i++) {
			// result=26;
			result = result * 26 + col.charAt(i) - 'A' + 1;
		}
		return result;

	}
}
