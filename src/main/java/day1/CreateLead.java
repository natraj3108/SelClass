package day1;

import java.net.MalformedURLException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead {
//@Test(invocationCount=2,threadPoolSize=2)
	@Test(expectedExceptions={NoSuchElementException.class})
	public void cl()  throws MalformedURLException, InterruptedException {
		
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/control/main");
		driver.findElementById("username1").sendKeys("DemoSalesManager");
		/*driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Nesa");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		driver.findElementByName("submitButton").click();
		System.out.println("Successfull");
		driver.close();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
