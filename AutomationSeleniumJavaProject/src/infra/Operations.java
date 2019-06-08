package infra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

// Basic infrastructure level functions

public class Operations {

	//Click Link
	public static void clickLink(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("Clicked Link - "+ xpathExpression);

	}

	//Type in Textbox
	public static void setText(WebDriver driver, String xpathExpression, String inputText) {
		driver.findElement(By.xpath(xpathExpression)).sendKeys(inputText);
		System.out.println("Set Text - "+ xpathExpression + " - "+inputText);

	}

	//Select Radiobutton
	public static void selectRadiobutton(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("Selected Radiobutton - "+ xpathExpression);

	}

	//Select Checkbox
	public static void selectCheckbox(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("Selected Checkbox - "+ xpathExpression);

	}

	//Select Dropdown  
	public static void selectDropdown(WebDriver driver, String xpathExpression, String inputVal) {

		Select sel = new Select(driver.findElement(By.xpath(xpathExpression)));
		sel.selectByVisibleText(inputVal);

		System.out.println("Selected Dropdown - "+ xpathExpression + " - " + inputVal);

	}

	//Capture Text
	public static String getText(WebDriver driver, String xpathExpression) {
		String capturedText = driver.findElement(By.xpath(xpathExpression)).getText();
		System.out.println("Get Text - "+ xpathExpression + " - " + capturedText);
		return capturedText;

	}

	//Implicit Wait
	public static void waitImplicitely(WebDriver driver, long maxTimeout) {
		driver.manage().timeouts().implicitlyWait(maxTimeout, TimeUnit.SECONDS);
		System.out.println("waitImplicitely - "+ maxTimeout);
	}

	//Explicit Wait
	public static void waitExplicitely(WebDriver driver, long maxTimeout, String xpathExpression) {

		WebDriverWait webwait = new WebDriverWait(driver, maxTimeout);
		webwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
		System.out.println("waitExplicitely - "+ maxTimeout + " - "+ xpathExpression);
	}

	//Explicit Wait
	public static void waitExplicitely(WebDriver driver, long maxTimeout, String xpathExpression, String textToBePresent) {

		WebDriverWait webwait = new WebDriverWait(driver, maxTimeout);
		webwait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpathExpression)), textToBePresent));
		System.out.println("waitExplicitely - "+ maxTimeout + " - "+ xpathExpression);
	}
}
