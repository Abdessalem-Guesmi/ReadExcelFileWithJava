package App;

import utilities.ReadCellValue;

public class ReadCellValueApp {
	public static void main(String[] args) {
		ReadCellValue cellValue = new ReadCellValue();
		String vOutput = cellValue.ReadCellData(2, 2);
		System.out.println(vOutput);
	}
}
