package attributes;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class attributes extends LeafTapsWrapper {


	@Test
	public void createLead() throws Exception{
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Qeagle");		
	}
	
	@Test
	public void createContact() throws Exception{
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");	
	}
	
	@Test
	public void editContact() throws Exception{
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", "Gopinath");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTitle("View Lead | opentaps CRM");
		clickByXpath("//a[contains(text(),'Edit')]");
		selectVisibileTextById("updateLeadForm_industryEnumId", "Computer Software");
		clickByXpath("//input[@class='smallSubmit']");
	}
	
}
