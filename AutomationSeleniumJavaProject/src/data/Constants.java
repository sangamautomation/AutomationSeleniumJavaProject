package data;

import java.util.Random;

public class Constants {

	public static final String CHROMEDRIVER_PATH = "C:\\drivers\\chromedriver.exe";
	public static final String FIREFOXDRIVER_PATH = "C:/drivers\\geckodriver.exe";
	public static final String BROWSER_TYPE = "chrome";//firefox, edge
	public static final String BASE_URL = "http://toolsqa.com/automation-practice-form/";

	//public static final String DATAPOOL_PATH = "C:/AutomationProjects/AutomationTutorial/resources/Datapool.xls";
	//public static final String TESTDATAOUTPUT_PATH= "C:\\AutomationProjects/AutomationTutorial/resources/TestDataOutput.properties";

	Random rand = new Random();
	public static String workingDir = System.getProperty("user.dir"); //C:\\AutomationProjects\\TestAutomation_Selenium
	//public static String datapoolPath = "C:\\AutomationProjects\\SeleniumTutorial\\resources\\TestDataPool_Automation.xls";

	public static final String CONFIG_PATH = workingDir + "/src/data/config.properties";
	public static final String DATAPOOL_PATH = workingDir + "/resources/Datapool.xls";
	public static final String TESTDATAOUTPUT_PATH= workingDir+ "\\resources/TestDataOutput.properties";

	public static String automationDatapoolPath = workingDir + "\\resources\\TestDataPool_Automation.xls";


	//	public static String screenshotFolderPath = "C:\\Selenium_Logs\\Screenshots\\";
	public static String screenshotFolderPath = "C:\\Selenium_Logs\\Screenshots\\";
	
	public static String captionsFolderPath = "C:\\Selenium_Logs\\Screenshots\\Captions.properties";

	public static String configPath = "C:/AutomationProjects/SeleniumTutorial/src/config/config.properties";
	public static int counter = 0;

	public static String dataPool_Xls = "C:\\AutomationProjects\\SeleniumTutorial\\resources\\TestDataPool_Automation.xls"; 
	public static String dataPool_Xlsx = "C:/Selenium_Logs/TestData/Datapool.xlsx"; // \\=/

}
