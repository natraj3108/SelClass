package day3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");

		System.out.println(driver.getTitle());

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		System.out.println(driver.getTitle());

		Set<String> allWin = driver.getWindowHandles();

		System.out.println(allWin.size());

		for (String eachWin : allWin) {

			driver.switchTo().window(eachWin);

			System.out.println(eachWin);
		}
		driver.quit();



















	}

}
