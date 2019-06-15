package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import data.TestDataPool;

/**
 *Read & Write from/to Property File
 *@author Sangam
 */
public class PropertyUtils {


	public static String propertyFile_Read(String path, String prop){


		Properties props = new Properties();

		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Property is read for "+prop +"="+props.getProperty(prop));

		return props.getProperty(prop);

	}


	public static void propertyFile_Write(String path, String prop, String value){

		Properties props = new Properties();

		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
			//		e.printStackTrace();
		}



		try {
			if(value!=null){
				props.setProperty(prop, value);
				props.store(new FileOutputStream(path), "");
				System.out.println("Property is set for "+prop +"="+value);
			}
			else
				System.out.println("Property NOT set for "+prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}


	public static void propertySet(String path, String prop, String value)
			throws FileNotFoundException, IOException {
		//		OrderedProperties properties = new OrderedProperties();
		//		properties.load(new FileInputStream(new File("~/some.properties")));
		// Read Property File for environments

		//	System.out.println("$ Property set: ");

		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			if(value != null) {
				// citizenPortal = props.getProperty("TST1_CWPortal");
				props.setProperty(prop, value);
				props.store(new FileOutputStream(path), "comments");
				// System.out.println("$ Property set: " + prop + " = " + value); // Removed this as half of the log is with DP values.
				System.out.print( prop + " = " + value+"; "); // Prints all property+value combined values in a single line to save space in the Console/SystemOut.log
			}
			else
				System.out.println("$ Property NOT set: " + prop + " = "
						+ value);		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clearProps(String path) {

		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {

			// citizenPortal = props.getProperty("TST1_CWPortal");
			props.clear();
			props.store(new FileOutputStream(path), "comments");


		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	 
	public static void property_Set(String path, HashMap<String, String> rowData)
			throws FileNotFoundException, IOException {
		// Read Property File for environments
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			props.clear();
			props.putAll(rowData);
			props.store(new FileOutputStream(path), "comments");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Property Set with HashMap
	public static void propertySet(String path, HashMap<String, String> rowData)
			throws FileNotFoundException, IOException {

		//	FileSystemUtils.createFolder(path);

		// Read Property File for environments
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			props.clear();
			props.putAll(rowData);
			props.store(new FileOutputStream(path), "Captions-Header");
		//	System.out.println("$ Property set: " + rowData  );
 		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Property Set (HashMap inside)
	public static void propertySet(String path)
			throws FileNotFoundException, IOException {
		// Read Property File for environments
		HashMap<String,String> h = TestDataPool.tcData;

		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();	
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			//props.clear();
			props.putAll(h);
			props.store(new FileOutputStream(path), "Test Input Data");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


 
	
	public static String propertyGet(String path, String prop)
			throws FileNotFoundException, IOException {
		// Read Property File for environments
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("$ Property get: " + prop+" @ "+ path);

		return props.getProperty(prop);

		// props.store(new
		// FileOutputStream(Constants.workingDir+"\\Properties\\TestCaseLog.properties"),
		// "s");
	}

	 
}
