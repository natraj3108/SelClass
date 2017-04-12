package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement item1=driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item2=driver.findElementByXPath("//ol[@id='selectable']/li[2]");
		WebElement item3=driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item4=driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		WebElement item5=driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item6=driver.findElementByXPath("//ol[@id='selectable']/li[6]");
		WebElement item7=driver.findElementByXPath("//ol[@id='selectable']/li[7]");

		Actions builder = new Actions(driver);
		//builder.clickAndHold(item1).release(item4).build().perform();
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item3)
		.click(item5).click(item7).keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
