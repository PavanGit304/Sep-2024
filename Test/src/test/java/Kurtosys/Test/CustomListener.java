package Kurtosys.Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
//import TestNGListener_Screenshot.mainclass;

public class CustomListener extends mainclass implements ITestListener {
	
	public void onTestSucess(ITestResult result)
	{
		System.out.println("Test passed");
        
		
	}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed Test");
        
		try {
			failed(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}    // fn+f3 : it open the method  or right click on method -->open delcaration 
		
	}
}
