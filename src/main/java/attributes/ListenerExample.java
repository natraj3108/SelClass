package attributes;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("I am in onTestStart Method ");
		 
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("I am in onTestSuccess Method ");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("I am in onTestFailure Method ");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("I am in onTestSkipped Method ");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("I am in onTestFailedButWithinSuccessPercentage Method ");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("I am in onStart Method ");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("I am in onFinish Method ");
		
	}

	
	
	
	
	
	
	
	
}
