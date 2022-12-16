package ExcelPractice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File MyFile=new File("D:\\16th july selenium\\Pratiksha.xlsx");
	    Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	    int row = mySheet.getLastRowNum();
	    System.out.println(row);
	   int totalCell = mySheet.getRow(0).getLastCellNum()-1;
	   System.out.println(totalCell);
	   
	   //Read complete excel by using dynamic
	   //OuterLoop-->Row
	   for(int i=0;i<=row;i++)
	   {
		   //InnerLoop-->Cell
		   for(int j=0;j<=totalCell;j++)
		   {
			   CellType dataType = mySheet.getRow(i).getCell(j).getCellType();
			   if(dataType==CellType.STRING)
			   {
				   String value1 = mySheet.getRow(i).getCell(j).getStringCellValue();
			      System.out.print(value1+" ");
			   }
			   else if(dataType==CellType.NUMERIC)
			   {
				    double value2 = mySheet.getRow(i).getCell(j).getNumericCellValue();
				    System.out.print(value2+" ");
			   }
			   else if(dataType==CellType.BOOLEAN)
			   {
				   boolean value3 = mySheet.getRow(i).getCell(j).getBooleanCellValue();
				   System.out.print(value3+" ");
			   }
			   }
			   
			   System.out.println();
			   
	   }
	   System.out.println("-----------------");
	   for(int i=0;i<=totalCell;i++)
	   {
		   String value4 = mySheet.getRow(1).getCell(i).getStringCellValue();
		   System.out.print(value4+" ");
	   }
	   System.out.println();
	    
	    
		
	}

}
