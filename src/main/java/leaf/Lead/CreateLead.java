package leaf.Lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;
import wrappers.TestData;

public class CreateLead extends LeafTapsWrapper{
	
	//@Test(groups = {"smoke"})
	//@Test(dataProvider="DataSource", dataProviderClass=TestData.class)
	@Test(invocationCount=5)	
	public void createLead() throws Exception{	
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Qeagle");
		enterById("createLeadForm_firstName", "Gopi");
		enterById("createLeadForm_lastName", "N");		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}









