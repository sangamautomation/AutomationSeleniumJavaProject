package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Excel Utility Functions - Read from XLS, XLSX
 * @author Sangam
 */
public class ExcelUtils {

	/**
	 * Returns a HashMap of the row for the given testCaseID, sheetName and
	 * Excel sheet(xlsx).
	 * 
	 * @param filePath
	 *            eg:Constants.workingDir+"\\Datapool\\Datapool.xlsx"
	 * @param sheetName
	 * @param headerRowNum
	 * @param testCaseID
	 * @return HashMap<String, String>
	 */
	public static HashMap<String,String> getTestDataXls(String filePath, String sheetName, int headerRowNum, int tcRowNum) throws Exception
	{
	
 
		HashMap<String,String> rowData = new HashMap<>();
		
		HSSFSheet sheet = null;
		HSSFWorkbook workbook = null;
		HSSFRow  headerRow,tcRow;
		
		FileInputStream file = null;
		
		//File file1 = new File(filePath);
		//FileInputStream fis = new FileInputStream(file1);
 		try {
			file = new FileInputStream(new File(filePath));//D:\Selenium_Logs\TestData\Datapool.xls 
		workbook = new HSSFWorkbook(file);
	 	
		} catch (Exception e) {
 			e.printStackTrace();
		} 
		
		
		sheet = workbook.getSheet(sheetName);
		headerRow = sheet.getRow(headerRowNum);
		tcRow = sheet.getRow(tcRowNum);
		
		Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = headerRow.cellIterator();
		
		int i = 0;
		while(cellIterator.hasNext()){
			
			org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
			
			rowData.put(cellValueStr(workbook,headerRow,i), cellValueStr(workbook,tcRow,i));
			
		i++;
			
		}
				
		workbook.close();
		file.close();
 	
		return rowData;
 	
	
}
	

	public static String cellValueStr (HSSFWorkbook workbook, HSSFRow row, int cellNum){
		DataFormatter format = new DataFormatter();
		FormulaEvaluator eval = new HSSFFormulaEvaluator(workbook);
		
		HSSFCell cellValue = row.getCell(cellNum);
		
		eval.evaluate(cellValue);
		
		String cellValueStr = format.formatCellValue(cellValue,eval);
		
		
		return cellValueStr;
	 	
		
	}
	
	public static String cellValueStrX (XSSFWorkbook workbook, XSSFRow row, int cellNum){
		DataFormatter format = new DataFormatter();
		FormulaEvaluator eval = new XSSFFormulaEvaluator((XSSFWorkbook) workbook);
		
		XSSFCell cellValue = row.getCell(cellNum);
		
		eval.evaluate(cellValue);
		
		String cellValueStr = format.formatCellValue(cellValue,eval);
		
		
		return cellValueStr;
	 	
		
	}
	
	
 
 	
 	////
 	
 	
	public static HashMap<String, String> getTestDataXlsx(String filePath,
			String sheetName, int headerRowNum, String testCaseID) {
		HashMap<String, String> rowData = new HashMap<>();
		XSSFSheet sheet = null;
		XSSFWorkbook workbook = null;
		XSSFRow tcRow, headerRow;
		FileInputStream file = null;

		try {
			file = new FileInputStream(new File(filePath));

			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = workbook.getSheet(sheetName);
		headerRow = sheet.getRow(headerRowNum); // Row number which contains the columns
		// names
		tcRow = sheet.getRow(findRow(sheet, testCaseID));
		// iterate through each columns
		Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = headerRow
				.cellIterator();
		int i = 0;
		while (cellIterator.hasNext()) {
			org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();

			rowData.put(cellValueStr(workbook, headerRow, i),
					cellValueStr(workbook, tcRow, i));
			// System.out.println(i + ":Key="
			// + cellValueStr(workbook, headerRow, i) + ",Value="
			// + cellValueStr(workbook, tcRow, i));
			i++;
		}
		try {
			workbook.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//	System.out.println("DataPool Records - " + sheetName +" - " + testCaseID + ": \n"+  rowData  );
		try {
			// Prints Hashmap data to property file
			//	printHashmap(rowData);// The date elements are converted from number to date; Some elements are modified and put back to rowData and need to add few more elements separately, So, the values are written to property file after modification which need to be done from testdatapool itself.
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowData;
	}


	
	/**
	 * Retuns a HashMap with the Random names of 8 persons from the list of names given in the sheetName located at filePath
	 * @param filePath
	 * @param sheetName
	 * @return
	 */
	public static HashMap<String, String> getNamesMap(String filePath,
			String sheetName) {
		HashMap<String, String> namesData = new HashMap<>();
		XSSFSheet sheet = null;
		XSSFWorkbook workbook = null;
		XSSFRow tcRow, headerRow;
		FileInputStream file = null;
		int noOfPersons = 8;

		try {
			file = new FileInputStream(new File(filePath));

			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = workbook.getSheet(sheetName);
		int noOfRows = sheet.getPhysicalNumberOfRows();

		for(int i = 1; i <= noOfPersons; i++){

			tcRow = sheet.getRow(randInt(1, noOfRows));
			namesData.put("firstName"+i, cellValueStr(workbook, tcRow, 0));
			tcRow = sheet.getRow(randInt(1, noOfRows));
			namesData.put("middleName"+i, cellValueStr(workbook, tcRow, 1));
			tcRow = sheet.getRow(randInt(1, noOfRows));
			namesData.put("lastName"+i, cellValueStr(workbook, tcRow, 2));

		}	
		try {
			workbook.close();
			file.close();
		} catch (IOException e) {
 			e.printStackTrace();
		}
		return namesData;
	}


	/**
	 * Returns random name from the given columnWanted from the sheetName at filePath
	 * @param filePath
	 * @param sheetName
	 * @param columnWanted
	 * @return
	 */
	public static String getName(String filePath,
			String sheetName, String columnWanted) {
		XSSFSheet sheet = null;
		XSSFWorkbook workbook = null;
		XSSFRow tcRow, headerRow;
		FileInputStream file = null;

		try {
			file = new FileInputStream(new File(filePath));

			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = workbook.getSheet(sheetName);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		Integer columnNo = null;

		headerRow = sheet.getRow(0);

		for(org.apache.poi.ss.usermodel.Cell cell:headerRow){
			if (cell.getStringCellValue().equals(columnWanted)){
				columnNo = cell.getColumnIndex();
			}
		}


		if (columnNo != null){
			tcRow = sheet.getRow(randInt(1, noOfRows));
			return cellValueStr(workbook, tcRow, columnNo);
		}else{
			System.out.println("could not find column " + columnWanted + " in first row");
		}
		try {
			workbook.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * Returns a psuedo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimim value
	 * @param max Maximim value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static int findRow(XSSFSheet sheet, String cellContent) {/*
		for (org.apache.poi.ss.usermodel.Row row : sheet) {
			for (org.apache.poi.ss.usermodel.Cell cell : row) {
				 if (cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING) {
 					if (cell.getRichStringCellValue().getString().trim()
							.equals(cellContent)) {
						return row.getRowNum();
					}
				}
			}
		}
	*/	return 0;
	}

	public static String cellValueStr(XSSFWorkbook workbook, XSSFRow row, int cellNum) {

		DataFormatter objDefaultFormat = new DataFormatter();
		FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(
				(XSSFWorkbook) workbook);

		XSSFCell cellValue = row.getCell(cellNum);
		objFormulaEvaluator.evaluate(cellValue); // This will evaluate the cell,
		// And any type of cell will
		// return string value
		String cellValueStr = objDefaultFormat.formatCellValue(cellValue,
				objFormulaEvaluator);
		return cellValueStr;
	}


	 

	public static String cellToString(XSSFCell column){
		Object result;
		//int type = column.getCellType();
		int type = Integer.parseInt(column.getCellType().toString());
		switch(type){
		case 0:
			result = (int)column.getNumericCellValue();
			break;
		case 1:
			result = column.getStringCellValue();
			break;
		default:
			throw new RuntimeException("This column data type is not identified");
		}
		return result.toString();
	}

 
 		/**
 		 * generateCsvFile
 		 * @param sFileName
 		 * generateCsvFile("c:\\test.csv"); 
 		 */
 		private static void generateCsvFile(String sFileName)
 		{
 			try
 			{
 				FileWriter writer = new FileWriter(sFileName);

 				writer.append("Name");
 				writer.append(',');
 				writer.append("Age");
 				writer.append('\n');

 				writer.append("Sangam");
 				writer.append(',');
 				writer.append("26");
 				writer.append('\n');

 				writer.append("Yadagiri");
 				writer.append(',');
 				writer.append("29");
 				writer.append('\n');

 				//generate whatever data you want

 				writer.flush();
 				writer.close();
 			}
 			catch(IOException e)
 			{
 				e.printStackTrace();
 			} 
 		}
 		
 		public HashMap<String, String> loadExcelData(String xlsxPath) throws Exception{
 			File myFile = new File(xlsxPath); 
 			FileInputStream fis = new FileInputStream(myFile); 
 			HashMap<String, String> excelData = new HashMap<>();
 			HashMap<String, String> headerData = new HashMap<>();
 			// Finds the workbook instance for XLSX file 
 			XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 
 			DataFormatter objDefaultFormat = new DataFormatter();
 			FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(
 					(XSSFWorkbook) myWorkBook);
 			
 			// Return first sheet from the XLSX workbook 
 			XSSFSheet mySheet = myWorkBook.getSheetAt(0); 
 			
 			// Get iterator to all the rows in current sheet 
 			Iterator<Row> rowIterator = mySheet.iterator(); 
 			Row row = rowIterator.next();
 			int colNo = 0, rowNo = 1;
 			Iterator<Cell> cellIterator = row.cellIterator();
 			while (cellIterator.hasNext()) {
 				Cell cell = cellIterator.next();
 				colNo++;
 				objFormulaEvaluator.evaluate(cell);
 				String cellValueStr = objDefaultFormat.formatCellValue(cell,
 						objFormulaEvaluator);
 				System.out.println(cellValueStr);
 				headerData.put("col"+colNo, cellValueStr);
 			}
 			
 			// Traversing over each row of XLSX file 
 			while (rowIterator.hasNext()) {
 				row = rowIterator.next();
 				// For each row, iterate through each columns
 				cellIterator = row.cellIterator();
 				colNo=0;
 				while (cellIterator.hasNext()) {
 					Cell cell = cellIterator.next();
 					colNo++;
 					objFormulaEvaluator.evaluate(cell);
 					String cellValueStr = objDefaultFormat.formatCellValue(cell,
 							objFormulaEvaluator);
 					System.out.println(cellValueStr);
 					excelData.put(headerData.get("col"+colNo) + rowNo, cellValueStr);
 				}
 				rowNo++;
 			}
 			myWorkBook.close();
 			fis.close();
 			return excelData;
 		}
 
}
