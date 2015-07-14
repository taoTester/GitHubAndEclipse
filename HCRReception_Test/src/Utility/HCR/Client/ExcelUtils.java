package Utility.HCR.Client;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelUtils {

	private static XSSFWorkbook excelWorkbook;
	private static XSSFSheet excelSheet;
	private static XSSFRow excelRow;
	private static XSSFCell excelCell;

	

//	根据后缀名来选择不同版本的Excel
//	public void selectExcel(String fileName){ 
//		
//		if(fileName.substring(fileName.indexOf(".")).equals(".xlsx")){
//			
//			workbook = new XSSFWorkbook();
//	
//		} else if (fileName.substring(fileName.indexOf(".")).equals(".xls")) {
//			
//			workbook = new HSSFWorkbook();
//		}
//		
//	}
	
	//设置Excel所在的路径和所用的sheet
	public static void setExcelFile(String filePath,String sheetName) throws Exception{
		
		try {
			FileInputStream excelFile = new FileInputStream(filePath);
			excelWorkbook = new XSSFWorkbook(excelFile);
			excelSheet = excelWorkbook.getSheet(sheetName);
			Log.info("ExcelUtils-setExcelFile-成功找到Excel数据文件");
		} catch (Exception e) {

			Log.error("ExcelUtils-setExcelFile-没有找到Excel数据文件的原因是："+ e.getMessage());
			throw(e);
		}
		
	}
	
	//获取到excel表中单元格的数据
	public static String getCellData(int RowNum,int ColNum) throws Exception{
		
		try {
			
			excelCell = excelSheet.getRow(RowNum).getCell(ColNum);
			String CellData = excelCell.getStringCellValue();
			Log.info("ExcelUtils-getCellData-成功获取到cell数据");
			return CellData;
			
		} catch (Exception e) {
			
			Log.error("ExcelUtils-getCellData-失败的获取到cell数据的原因是："+e.getMessage());
			throw(e);
		}
		
	}
	
	//首先判断这一列和这个单元格是否为空，如果为空则创建一个新列，并给单元格赋值，如果列不为空，则直接设置单元格的值
	@SuppressWarnings("static-access")
	public static void setCellData(String value, int rowNum, int colNum) throws Exception{
		
		try {
			
			excelRow = excelSheet.getRow(rowNum);
			excelCell = excelRow.getCell(colNum, excelRow.RETURN_BLANK_AS_NULL);
			if(excelCell==null){
				
				excelCell = excelRow.createCell(colNum);
				excelCell.setCellValue(value);
				
			}else {
				excelCell.setCellValue(value);
			}
			//直接调用常量中定义的字段获取excel所在的路径和sheet
			FileOutputStream fileOutputStream = new FileOutputStream(Constant.EXCELFILE_PATH+Constant.EXCELSHEET_NAME);
			excelWorkbook.write(fileOutputStream);
			fileOutputStream.flush();
			fileOutputStream.close();
			Log.info("ExcelUtils-setCellData-成功的设置新的excel单元格");
			
		} catch (Exception e) {

			Log.error("ExcelUtils-setCellData-失败的设置excel单元格的原因： "+e.getMessage());
		}
		
	}
	
	//获取Excel当前sheet中数据存在的行数
	public static int getLastRow() throws Exception{
		
		try {
			
			int lastRowNum = excelSheet.getLastRowNum();
			Log.info("ExcelUtils-getLastRow-成功的获取到excel有多少行");
			return lastRowNum;
			
		} catch (Exception e) {
		
			Log.error("ExcelUtils-getLastRow-失败的获取Excel多少行的原因是： "+e.getMessage());
			throw(e);
		
		}	
		
	}
	
	//获取测试用例有多少步骤数量，同一个测试用例有多个步骤，获取这些步骤的数量。
	public static int getConstantNum(String testCaseName, int colNum)throws Exception{
		
		int num;
		try {
			int rowCount= ExcelUtils.getLastRow();
			for(num=0;num<rowCount;num++){
				
				if(ExcelUtils.getCellData(num, colNum).equalsIgnoreCase(testCaseName)){
					
					break;
				}	
			}
			Log.info("ExcelUtils-getConstantNum-获取一个TestCase的步骤数量");
			return num;
			
		} catch (Exception e) {

			
            Log.error("ExcelUtils-getConstantNum-失败获取一个TestCase的步骤数量: "+e.getMessage());
			throw(e);
		}	
		
	}


	
}
