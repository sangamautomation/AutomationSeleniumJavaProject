package utils;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Screenshot Utils
 * @author Sangam
 */
public class ScreenshotUtils {
	
	
	
	/**
	 * screenshot - Takes screenshot using Robot Class
	 * @param folderPath
	 * @param counter
	 */
	public static void screenshot(String folderPath, int counter){
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);
		
		Robot robot = null;
	try {
		 robot = new Robot();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	String sCounter = "0000"+String.valueOf(counter);
	sCounter = sCounter.substring(sCounter.length()-4,sCounter.length());
	
	
	// Save captured image
	BufferedImage image = robot.createScreenCapture(screenRect);
	
	// Folder existance check
	
	File dir = new File(folderPath);
	if(!dir.exists())
	dir.mkdirs();
	 
	try {
		ImageIO.write(image, "jpg", new File(folderPath+ "/screenShot"+sCounter+".jpg"));
	} catch (IOException e) {
 		e.printStackTrace();
	}
	
	System.out.println("Screenshot is captured @ "+folderPath+ "/screenShot"+sCounter+".jpg");
	
	}

}
