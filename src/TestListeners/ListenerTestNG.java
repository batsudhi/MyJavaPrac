package TestListeners;

import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());
	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("The name of the testcase failed is :"+result.getName());
	}	

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase Skipped is :"+result.getName());				
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
