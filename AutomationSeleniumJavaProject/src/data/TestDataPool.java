package data;

import java.util.HashMap;

import utils.ExcelUtils;
import utils.FileSystemUtils;
import utils.PropertyUtils;
/**
 * Test data pool reading for test case row data
 * @author Sangam
 */
public class TestDataPool {
public static HashMap<String, String> tcData = new HashMap<>();

//Default constructor (will be called when the class is instantiated)
public TestDataPool(){
	try {
		tcData=ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "Automation", 0, 1);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

//Parameterized constructor to read any test case data
public TestDataPool(int tcRowNumber){
	
	// Current Thread - Stack

	String stack;
	try {
		stack = Thread.currentThread().getStackTrace()[3].getClassName(); // For 3rd stack including AutomationProjects classes
	} catch (Exception e1) {
		stack = Thread.currentThread().getStackTrace()[2].getClassName(); // From elicpse, the test case is 2nd stack
	}
	String packageName = stack.substring(0,stack.lastIndexOf("."));
 	String className = stack; //e.g.regressionTest.test.Testcase100
	System.out.println("Test Case Details:");
	System.out.println("Complete TestCase Name = "+stack);
  	
	//Deleting the old execution's screenshots
	FileSystemUtils.deleteFilesWithExtension(Constants.screenshotFolderPath, ".jpg");
	PropertyUtils.clearProps(Constants.captionsFolderPath);
	try {
		tcData=ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "Automation", 0, tcRowNumber);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
