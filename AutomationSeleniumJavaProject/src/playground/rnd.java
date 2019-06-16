package playground;

import java.awt.AWTException;

import utils.KeyboardUtils;

public class rnd {

	public static void main(String[] args) {
		try {
			String path1 = "C";
			String path2 = "\\Users\\sanga\\OneDrive\\Documents\\Automation_Class\\Images\\profile.png";
			String fullpath = "C:\\Users\\sanga\\OneDrive\\Documents\\Automation_Class\\Images\\profile.png#$?";

			
			
//			new KeyboardUtils().type(path1);
//			new KeyboardUtils().Key_Colon();
//			new KeyboardUtils().type(path2);
//			
			new KeyboardUtils().type(fullpath);
		} catch (Exception e) {
 			e.printStackTrace();
		}

	}

}
