package pageFlows;

import org.openqa.selenium.WebDriver;

import infra.Operations;
import pageObjects.AutomationPracticeFormObj;

public class AutomationPracticeFormPage {
	
	public static void PracticeAutomationForm(WebDriver driver) {
				
		//Capturing text of Automation Practice Form headline
		Operations.getText(driver, AutomationPracticeFormObj.label_AutomationPracticeForm);
		Operations.getText(driver, AutomationPracticeFormObj.label_PersonalInformtion);
		Operations.clickLink(driver, AutomationPracticeFormObj.link_PartialLinkText);
		Operations.waitImplicitely(driver, 50);
		
		
	}

}
