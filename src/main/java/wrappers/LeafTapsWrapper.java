package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends GenericWrappers {
	
	@Parameters({"url","userName","password"})
	@BeforeMethod(groups ={"common"})
	public void login(String url, String uName, String password) throws Exception {
		invokeApp("chrome", url);
		enterById("username", uName);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");	
		
	}
	
	@AfterMethod(groups ={"common"})
	public void closeBrowser(){
		quitBrowser();
	}
	
	
}
