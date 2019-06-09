package pageFlows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import infra.Operations;
import pageObjects.AutomationPracticeFormObj;

public class AutomationPracticeFormPage {
	
	public static void PracticeAutomationForm(WebDriver driver) {
				
		//Capturing text of Automation Practice Form headline
		Operations.getText(driver, AutomationPracticeFormObj.label_AutomationPracticeForm);
		Operations.getText(driver, AutomationPracticeFormObj.label_PersonalInformtion);
	//Operations.clickLink(driver, AutomationPracticeFormObj.link_PartialLinkText);
	//Operations.waitImplicitely(driver, 50);
		Operations.clickLink(driver, AutomationPracticeFormObj.link_LinkTest);
		
		//Table Operations
		Operations.getText(driver, AutomationPracticeFormObj.table_11);
		Operations.getText(driver, AutomationPracticeFormObj.table_12);
		Operations.getText(driver, AutomationPracticeFormObj.table_13);
		Operations.getText(driver, AutomationPracticeFormObj.table_14);
		Operations.getText(driver, AutomationPracticeFormObj.table_15);
		Operations.getText(driver, AutomationPracticeFormObj.table_16);
		Operations.getText(driver, AutomationPracticeFormObj.table_21);
		Operations.getText(driver, AutomationPracticeFormObj.table_22);
		Operations.getText(driver, AutomationPracticeFormObj.table_23);
		Operations.getText(driver, AutomationPracticeFormObj.table_24);
		Operations.getText(driver, AutomationPracticeFormObj.table_25);
		Operations.getText(driver, AutomationPracticeFormObj.table_26);
		Operations.getText(driver, AutomationPracticeFormObj.table_31);
		Operations.getText(driver, AutomationPracticeFormObj.table_32);
		Operations.getText(driver, AutomationPracticeFormObj.table_33);
		Operations.getText(driver, AutomationPracticeFormObj.table_34);
		Operations.getText(driver, AutomationPracticeFormObj.table_35);
		Operations.getText(driver, AutomationPracticeFormObj.table_36);
		Operations.getText(driver, AutomationPracticeFormObj.table_41);
		Operations.getText(driver, AutomationPracticeFormObj.table_42);
		Operations.getText(driver, AutomationPracticeFormObj.table_43);
		Operations.getText(driver, AutomationPracticeFormObj.table_44);
		Operations.getText(driver, AutomationPracticeFormObj.table_45);
		Operations.getText(driver, AutomationPracticeFormObj.table_46);
		Operations.getText(driver, AutomationPracticeFormObj.table_51);
		Operations.getText(driver, AutomationPracticeFormObj.table_51);
		Operations.getText(driver, AutomationPracticeFormObj.table_53);
		Operations.getText(driver, AutomationPracticeFormObj.table_54);
		Operations.getText(driver, AutomationPracticeFormObj.table_55);
		Operations.getText(driver, AutomationPracticeFormObj.table_56);
		Operations.getText(driver, AutomationPracticeFormObj.table_61);
		Operations.getText(driver, AutomationPracticeFormObj.table_62);

		//Go back
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Operations.setText(driver, AutomationPracticeFormObj.textbox_FirstName, "Mamun");
		Operations.setText(driver, AutomationPracticeFormObj.textbox_LastName, "Shah");

		Operations.selectRadiobutton(driver, AutomationPracticeFormObj.radiobutton_SexMale);
		Operations.selectRadiobutton(driver, AutomationPracticeFormObj.radiobutton_Experience6);
		
		Operations.setText(driver, AutomationPracticeFormObj.textbox_Date, "06/09/2019");
		Operations.selectCheckbox(driver, AutomationPracticeFormObj.checkboxAutomationTester);

		
		

	}

}
