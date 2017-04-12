package aui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.aspnetawesome.com/GridCheckboxesDemo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement table = driver
				.findElementByXPath("(//table[@class='awe-table'])[4]");
		List<WebElement> tableRows = table.findElements(By
				.xpath("(//table[@class='awe-table'])[4]/tbody/tr"));
		int RowCount = tableRows.size();
		for (int i = 1; i <= RowCount; i++) {
			WebElement row = driver.findElementByXPath("(//table[@class=" +
					"'awe-table'])[4]/tbody/tr["
					+ i + "]");
			List<WebElement> tableDatas = row.findElements(By.xpath(
					"(//table[@class='awe-table'])[4]/tbody/tr["+i+"]/td"));
			for (WebElement tableData : tableDatas) {
				System.out.print(tableData.getText()+"         ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
