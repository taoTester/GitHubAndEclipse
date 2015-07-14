package actionModules;

import PageObject.HCR.Client.Home_Page;
import PageObject.HCR.Client.LogIn_Page;
import Utility.HCR.Client.Constant;
import Utility.HCR.Client.ExcelUtils;
import Utility.HCR.Client.Log;

public class LogIn_Actions {

	public static void execute(int testCaseRow){
		
		try {
			
			
			Home_Page.logInBtn().click();
			Log.info("Click the LogIn btn on the HomePage");
			
			Log.info("Click the enterprise login btn on the LogInPage");
			LogIn_Page.enterpriseLogin().click();
			
			Log.info("Input the UserName");
			String userName = ExcelUtils.getCellData(testCaseRow, Constant.EXCEL_USERNAME);
			LogIn_Page.enterpriseUserName().sendKeys(userName);
			
			Log.info("Input the password");
			String passWord = ExcelUtils.getCellData(testCaseRow, Constant.EXCEL_PASSWORD);
			LogIn_Page.enterprisePassWord().sendKeys(passWord);
			
		} catch (Exception e) {
	
			Log.error("Some elements cannot be found: "+e.getMessage());
		}
		
	}
	
	
}
