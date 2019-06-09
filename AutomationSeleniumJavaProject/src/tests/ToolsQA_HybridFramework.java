package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageFlows.AutomationPracticeFormPage;
import setup.TestRunSetup;

public class ToolsQA_HybridFramework {

	public static void main(String[] args) {
		
		System.out.println("*** Start ToolsQA Automation Test ***");

		// Setup
		WebDriver driver = null;
		driver = TestRunSetup.launchBrowser("chrome", "http://toolsqa.com/automation-practice-form/");
		
		// Test steps
		AutomationPracticeFormPage.PracticeAutomationForm(driver);
		
		
		//driver.close();
		
		System.out.println("*** End ToolsQA Automation Test ***");
	
	}

}
