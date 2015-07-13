package actionModules;

import PageObject.HCR.Client.Home_Page;
import PageObject.HCR.Client.LogIn_Page;
import Utility.HCR.Client.Constant;
import Utility.HCR.Client.ExcelUtils;

public class LogIn_Actions {

	public static void execute(int testCaseRow){
		
		try {
			Home_Page.logInBtn().click();
			LogIn_Page.enterpriseLogin().click();
			String userName = ExcelUtils.getCellData(testCaseRow, Constant.EXCEL_USERNAME);
			LogIn_Page.enterpriseUserName().sendKeys(userName);
			
			String passWord = ExcelUtils.getCellData(testCaseRow, Constant.EXCEL_PASSWORD);
			LogIn_Page.enterprisePassWord().sendKeys(passWord);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
