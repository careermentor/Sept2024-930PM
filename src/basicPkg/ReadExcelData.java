package basicPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData 
{

	
	public static void readdata() throws Exception
	{
		File f = new File("./TestData/testdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheet("data");
		
		int nr = sh.getPhysicalNumberOfRows();
		System.out.println(nr);  //3
		
		for(int i = 0; nr>i; i++)  //3<0, 3<1, 3<2, 3<3
		{
			XSSFRow row = sh.getRow(i);  //i=0, i=1, i=2, i=3
			
			int nc = row.getPhysicalNumberOfCells();  //1, 2, 3
			
			for(int j=0; nc>j; j++) //1<0, 2<0, 2<1, 3<0, 3<1, 3<2
			{
				XSSFCell col = row.getCell(j);  //j=0
				System.out.print(col.getStringCellValue() + "    ");
			}
			
			System.out.println();
		}
		
		
		/*
		//First row
		XSSFRow row1 = sh.getRow(0);  //first row
		XSSFCell col1 = row1.getCell(0);  //first column
		System.out.println(col1.getStringCellValue());
		
		//Second row
		XSSFRow row2 = sh.getRow(1);  //second row
		XSSFCell col21 = row2.getCell(0);  //first column
		System.out.print(col21.getStringCellValue() + "   ");
		XSSFCell col22 = row2.getCell(1);  //second column
		System.out.println(col22.getStringCellValue());
		
		//Third row
		XSSFRow row3 = sh.getRow(2);  //third row
		XSSFCell col31 = row3.getCell(0);  //first column
		System.out.print(col31.getStringCellValue() + "    ");
		XSSFCell col32 = row3.getCell(1);  //second column
		System.out.print(col32.getStringCellValue() + "    ");
		XSSFCell col33 = row3.getCell(2);  //second column
		System.out.println(col33.getStringCellValue());
		*/
	}
	
	public static void main(String[] args) throws Exception {
		
		readdata();
	}
	
}
