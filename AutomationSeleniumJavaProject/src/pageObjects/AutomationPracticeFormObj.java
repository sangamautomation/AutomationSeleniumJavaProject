package pageObjects;

public class AutomationPracticeFormObj {
	
	public static final String label_AutomationPracticeForm = "//div/h1[contains(text(),'Automation Practice Form')]";
	
	public static final String label_PersonalInformtion = "//form[contains(@class,'form-horizontal')]/fieldset/legend/strong[contains(text(),'PERSONAL INFORMATION')]";
	public static final String link_PartialLinkText = "//a[contains(@title,'Automation Practice Form')]";
	public static final String link_LinkTest = "//a[contains(@title,'Table')]";
	
	//WebTable
	public static final String table_11 = "//table/thead/tr/th[1]";
	public static final String table_12 = "//table/thead/tr/th[2]";
	public static final String table_13 = "//table/thead/tr/th[3]";
	public static final String table_14 = "//table/thead/tr/th[4]";
	public static final String table_15 = "//table/thead/tr/th[5]";
	public static final String table_16 = "//table/thead/tr/th[6]";
	public static final String table_17 = "//table/thead/tr/th[7]";
	
	public static final String table_21 = "//table/tbody/tr[1]/th";
	public static final String table_22 = "//table/tbody/tr[1]/td[1]";
	public static final String table_23 = "//table/tbody/tr[1]/td[2]";
	public static final String table_24 = "//table/tbody/tr[1]/td[3]";
	public static final String table_25 = "//table/tbody/tr[1]/td[4]";
	public static final String table_26 = "//table/tbody/tr[1]/td[5]";
	public static final String table_27 = "//table/tbody/tr[1]/td[6]";
	
	public static final String table_31 = "//table/tbody/tr[2]/th";
	public static final String table_32 = "//table/tbody/tr[2]/td[1]";
	public static final String table_33 = "//table/tbody/tr[2]/td[2]";
	public static final String table_34 = "//table/tbody/tr[2]/td[3]";
	public static final String table_35 = "//table/tbody/tr[2]/td[4]";
	public static final String table_36 = "//table/tbody/tr[2]/td[5]";
	public static final String table_37 = "//table/tbody/tr[2]/td[6]";
	
	public static final String table_41 = "//table/tbody/tr[3]/th";
	public static final String table_42 = "//table/tbody/tr[3]/td[1]";
	public static final String table_43 = "//table/tbody/tr[3]/td[2]";
	public static final String table_44 = "//table/tbody/tr[3]/td[3]";
	public static final String table_45 = "//table/tbody/tr[3]/td[4]";
	public static final String table_46 = "//table/tbody/tr[3]/td[5]";
	public static final String table_47 = "//table/tbody/tr[3]/td[6]";

	public static final String table_51 = "//table/tbody/tr[4]/th";
	public static final String table_52 = "//table/tbody/tr[4]/td[1]";
	public static final String table_53 = "//table/tbody/tr[4]/td[2]";
	public static final String table_54 = "//table/tbody/tr[4]/td[3]";
	public static final String table_55 = "//table/tbody/tr[4]/td[4]";
	public static final String table_56 = "//table/tbody/tr[4]/td[5]";
	public static final String table_57 = "//table/tbody/tr[4]/td[6]";

	public static final String table_61 = "//div[@id=\"content\"]/table/tfoot/tr[1]/th[1]";
	public static final String table_62 = "//div[@id=\"content\"]/table/tfoot/tr[1]/td[1]";
	
	
	public static final String textbox_FirstName = "//input[contains(@name,'firstname')]";
	public static final String textbox_LastName = "//input[contains(@name,'lastname')]";

	public static final String radiobutton_SexMale = "//input[contains(@value,'Male')]";
	public static final String radiobutton_SexFemale = "//input[contains(@value,'Female')]";
	public static final String radiobutton_Experience0 = "//input[contains(@id,'exp-0')]";
	public static final String radiobutton_Experience1 = "//input[contains(@id,'exp-1')]";
	public static final String radiobutton_Experience2 = "//input[contains(@id,'exp-2')]";
	public static final String radiobutton_Experience3 = "//input[contains(@id,'exp-3')]";
	public static final String radiobutton_Experience4 = "//input[contains(@id,'exp-4')]";
	public static final String radiobutton_Experience5 = "//input[contains(@id,'exp-5')]";
	public static final String radiobutton_Experience6 = "//input[contains(@id,'exp-6')]";


	public static final String textbox_Date = "//input[contains(@id,'datepicker')]";
	public static final String checkbox_ManualTester = "//input[contains(@value,'Manual')]";
	public static final String checkboxAutomationTester = "//input[contains(@value,'Automation')]";

	public static final String button_ProfilePicture = "//input[contains(@id,'photo')]";
	
	public static final String link_Download = "//a[contains(text(),'Test File')]";
	public static final String checkbox_AutomationTool_Selenium = "//input[contains(@name,'tool') and @value='Selenium Webdriver']";
	public static final String dropdown_continents = "//select[contains(@name,'continents')]";
	public static final String combobox_SeleniumCommands = "//select[contains(@id,'selenium_commands')]";
	public static final String button_Submit = "//button[contains(@id,'submit')]";
	
}
