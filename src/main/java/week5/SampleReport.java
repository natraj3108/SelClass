package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	public void report() throws IOException{

		ExtentReports extent = new ExtentReports("./reports/result.html", false);

		extent.loadConfig(new File("./src/main/resources/extent-config.xml"));
		
		ExtentTest test = extent.startTest("Login");


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");

		File srcFile1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./snaps/snap100.jpeg");
		FileUtils.copyFile(srcFile1, destFile1);


		test.log(LogStatus.PASS, "Launch", "The Browser launched successfully"+test.addScreenCapture("./snaps/snap100.jpeg"));

		test.log(LogStatus.WARNING, "title", "The Title is not matching");

		test.log(LogStatus.FAIL, "UserName", "The UserName field is not found");

		extent.endTest(test);

		extent.flush();

	}

}












