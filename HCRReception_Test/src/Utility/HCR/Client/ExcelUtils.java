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

	

//	���ݺ�׺����ѡ��ͬ�汾��Excel
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
	
	//����Excel���ڵ�·�������õ�sheet
	public static void setExcelFile(String filePath,String sheetName) throws Exception{
		
		try {
			FileInputStream excelFile = new FileInputStream(filePath);
			excelWorkbook = new XSSFWorkbook(excelFile);
			excelSheet = excelWorkbook.getSheet(sheetName);
			Log.info("ExcelUtils-setExcelFile-�ɹ��ҵ�Excel�����ļ�");
		} catch (Exception e) {

			Log.error("ExcelUtils-setExcelFile-û���ҵ�Excel�����ļ���ԭ���ǣ�"+ e.getMessage());
			throw(e);
		}
		
	}
	
	//��ȡ��excel���е�Ԫ�������
	public static String getCellData(int RowNum,int ColNum) throws Exception{
		
		try {
			
			excelCell = excelSheet.getRow(RowNum).getCell(ColNum);
			String CellData = excelCell.getStringCellValue();
			Log.info("ExcelUtils-getCellData-�ɹ���ȡ��cell����");
			return CellData;
			
		} catch (Exception e) {
			
			Log.error("ExcelUtils-getCellData-ʧ�ܵĻ�ȡ��cell���ݵ�ԭ���ǣ�"+e.getMessage());
			throw(e);
		}
		
	}
	
	//�����ж���һ�к������Ԫ���Ƿ�Ϊ�գ����Ϊ���򴴽�һ�����У�������Ԫ��ֵ������в�Ϊ�գ���ֱ�����õ�Ԫ���ֵ
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
			//ֱ�ӵ��ó����ж�����ֶλ�ȡexcel���ڵ�·����sheet
			FileOutputStream fileOutputStream = new FileOutputStream(Constant.EXCELFILE_PATH+Constant.EXCELSHEET_NAME);
			excelWorkbook.write(fileOutputStream);
			fileOutputStream.flush();
			fileOutputStream.close();
			Log.info("ExcelUtils-setCellData-�ɹ��������µ�excel��Ԫ��");
			
		} catch (Exception e) {

			Log.error("ExcelUtils-setCellData-ʧ�ܵ�����excel��Ԫ���ԭ�� "+e.getMessage());
		}
		
	}
	
	//��ȡExcel��ǰsheet�����ݴ��ڵ�����
	public static int getLastRow() throws Exception{
		
		try {
			
			int lastRowNum = excelSheet.getLastRowNum();
			Log.info("ExcelUtils-getLastRow-�ɹ��Ļ�ȡ��excel�ж�����");
			return lastRowNum;
			
		} catch (Exception e) {
		
			Log.error("ExcelUtils-getLastRow-ʧ�ܵĻ�ȡExcel�����е�ԭ���ǣ� "+e.getMessage());
			throw(e);
		
		}	
		
	}
	
	//��ȡ���������ж��ٲ���������ͬһ�����������ж�����裬��ȡ��Щ�����������
	public static int getConstantNum(String testCaseName, int colNum)throws Exception{
		
		int num;
		try {
			int rowCount= ExcelUtils.getLastRow();
			for(num=0;num<rowCount;num++){
				
				if(ExcelUtils.getCellData(num, colNum).equalsIgnoreCase(testCaseName)){
					
					break;
				}	
			}
			Log.info("ExcelUtils-getConstantNum-��ȡһ��TestCase�Ĳ�������");
			return num;
			
		} catch (Exception e) {

			
            Log.error("ExcelUtils-getConstantNum-ʧ�ܻ�ȡһ��TestCase�Ĳ�������: "+e.getMessage());
			throw(e);
		}	
		
	}


	
}
