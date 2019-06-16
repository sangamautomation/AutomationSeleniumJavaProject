package pageFlows;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import data.TestDataPool;
import infra.Operations;
import pageObjects.AutomationPracticeFormObj;
import utils.KeyboardUtils;
import utils.ReportingUtils;

public class AutomationPracticeFormPage {

	public static void PracticeAutomationForm(WebDriver driver) {

		try {
			//Capturing text of Automation Practice Form headline
			Operations.getText(driver, AutomationPracticeFormObj.label_AutomationPracticeForm);
			Operations.getText(driver, AutomationPracticeFormObj.label_PersonalInformtion);
			Operations.clickLink(driver, AutomationPracticeFormObj.link_PartialLinkText);
			Operations.waitImplicitely(driver, 50);
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

			KeyboardUtils.Key_ScrollDown(1);
			ReportingUtils.reportResult("Pass", "ToolsQA", "Automation Practice Table Successful!");

			//Go back
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Operations.setText(driver, AutomationPracticeFormObj.textbox_FirstName,TestDataPool.tcData.get("firstName1")); 
			Operations.setText(driver, AutomationPracticeFormObj.textbox_LastName, TestDataPool.tcData.get("lastName1"));

			Operations.selectRadiobutton(driver, AutomationPracticeFormObj.radiobutton_SexMale);
			Operations.selectRadiobutton(driver, AutomationPracticeFormObj.radiobutton_Experience6);

			Operations.setText(driver, AutomationPracticeFormObj.textbox_Date, "06/09/2019");
			Operations.selectCheckbox(driver, AutomationPracticeFormObj.checkboxAutomationTester);

			Operations.clickLink(driver, AutomationPracticeFormObj.button_ProfilePicture);

			Thread.sleep(5000);

			//Browse File
			String filePath = "C:\\Users\\sanga\\OneDrive\\Documents\\Automation_Class\\Images\\profile.png";
			new KeyboardUtils().type(filePath);	
			new KeyboardUtils().Key_Enter();

			Thread.sleep(2000);
			ReportingUtils.reportResult("Pass", "ToolsQA", "Automation Practice Form Successful!");

			Operations.clickLink(driver, AutomationPracticeFormObj.link_Download);
			Operations.selectCheckbox(driver, AutomationPracticeFormObj.checkbox_AutomationTool_Selenium);
			Operations.selectDropdown(driver, AutomationPracticeFormObj.dropdown_continents,TestDataPool.tcData.get("continents"));

			String SeleniumCommands  =TestDataPool.tcData.get("SeleniumCommands");
			String[] SeleniumCommandsArray = SeleniumCommands.split(";");

			System.out.println(SeleniumCommandsArray[0]);
			System.out.println(SeleniumCommandsArray[1]);

			Operations.selectDropdown(driver, AutomationPracticeFormObj.combobox_SeleniumCommands, SeleniumCommandsArray[0]);
			Operations.selectDropdown(driver, AutomationPracticeFormObj.combobox_SeleniumCommands, SeleniumCommandsArray[1]);

			ReportingUtils.reportResult("Pass", "ToolsQA", "Automation Practice Form Successful!");

			Operations.waitImplicitely(driver, 20);
			Operations.clickLink(driver, AutomationPracticeFormObj.button_Submit);

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
