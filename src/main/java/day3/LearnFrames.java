package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		driver.findElementByXPath("//*[@id='selectable']/li[1]").click();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		driver.getWindowHandles();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
