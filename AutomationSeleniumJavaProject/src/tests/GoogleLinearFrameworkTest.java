package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Selenium Google Test with Linear Framework
 * @author Sangam
 */
public class GoogleLinearFrameworkTest {

	public static void main(String[] args) throws Exception {

		//Setup
		System.out.println("*** Start Google Test - Linear Framework ***");
		//Launching Browser & Opening URL
		System.setProperty("webdriver.chrome.driver", "C:/drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/drivers\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();

		try {

			//Launch & Open URL
			driver.get("https://www.google.com");

			//Maximize the browser
			driver.manage().window().maximize();

			Thread.sleep(2000); // Static wait
			
		//	Xpath of Google search textbox = //input[contains(@name,'q')]

			driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Flight Booking to Chicago");;
			
			// Implicit Wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Click outside in html page to escape suggestions list to be able to see Google Search Button to click it later
			driver.findElement(By.xpath("//html")).click();
			
			//Click on Google Search button
			driver.findElement(By.xpath("//div[2]/div/div[2]/div[2]/div/center/input[contains(@class,'gNO89b') and contains(@value,'Google Search') and contains(@name,'btnK') and contains(@type,'submit')]")).click();
			
		} catch (Exception e) {
			//e.printStackTrace();
			//throw e;
		}

		finally {
			//Close the browser
			driver.close();
			System.out.println("*** End Google Test - Linear Framework ***");
		}







	}

}
