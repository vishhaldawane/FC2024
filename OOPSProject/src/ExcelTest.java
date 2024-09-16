
public class ExcelTest {

	public static void main(String[] args) {
		WorkBook book1 = new WorkBook();
		book1.sheet1.cell1.setCellValue("50");
		book1.sheet1.cell2.setCellValue("60");
		book1.sheet1.cell3.setCellValue("70");
		book1.sheet1.cell4.setCellValue("55");
		book1.sheet1.cell5.setCellValue("45");
		book1.sheet1.cell6.setCellValue("33");

		book1.showBook();
	}
}
class Cell
{
	String columnName;
	int    rowNumber;
	String cellValue;
	
	public Cell(String columnName, int rowNumber, String cellValue) {
		super();
		this.columnName = columnName;
		this.rowNumber = rowNumber;
		this.cellValue = cellValue;
	}
	public Cell(String columnName, int rowNumber) {
		super();
		this.columnName = columnName;
		this.rowNumber = rowNumber;
	}
	
	@Override
	public String toString() {
		return "Cell [columnName=" + columnName + ", rowNumber=" + rowNumber + ", cellValue=" + cellValue + "]";
	}
	public void setCellValue(String cellValue) {
		this.cellValue = cellValue;
	}
	
	
}
class WorkSheet
{
	Cell cell1 = new Cell("A",1); //hasA
	Cell cell2 = new Cell("A",2);
	Cell cell3 = new Cell("A",3);
	Cell cell4 = new Cell("B",1);
	Cell cell5 = new Cell("B",2);
	Cell cell6 = new Cell("B",3);	
	
	void showSheet() {
		System.out.println("cell1 : "+cell1);
		System.out.println("cell2 : "+cell2);
		System.out.println("cell3 : "+cell3);
		System.out.println("cell4 : "+cell4);
		System.out.println("cell5 : "+cell5);
		System.out.println("cell6 : "+cell6);	
		System.out.println("-----------------");
	}
}

class Book 
{
	
}
class WorkBook extends Book //isA
{
	WorkSheet sheet1 = new WorkSheet(); //hasA
	WorkSheet sheet2 = new WorkSheet(); //hasA
	WorkSheet sheet3 = new WorkSheet(); //hasA
	
	void showBook() {
		System.out.println("-- Showing the WorkBook ---");
		sheet1.showSheet();
		sheet2.showSheet();
		sheet3.showSheet();
	}
	
}

/*
 
 		A	B	C	D
-------------------------------
 	1	50	55  <--- we call it as cell A1
 -------------------------------
 	2	60	45
 -------------------------------
 	3	70  33
 -------------------------------
 	4
 -------------------------------
Sheet1, Sheet2, Sheet3
*/
