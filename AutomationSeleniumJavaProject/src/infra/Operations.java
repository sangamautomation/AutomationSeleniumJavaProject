package infra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

// Basic infrastructure level functions

public class Operations {

	//Click a link
	public void clickLink(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("Click link successfully "+ xpathExpression);

	}

	//Textbox typing
	public void setText(WebDriver driver, String xpathExpression, String inputText) {
		driver.findElement(By.xpath(xpathExpression)).sendKeys(inputText);
		System.out.println("SetText into "+ xpathExpression + "-"+inputText);

	}

	//Select Radiobutton
	public void selectRadiobutton(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("Selected Radiobutton "+ xpathExpression);

	}

	//Select Checkbox
	public void selectCheckbox(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("Selected Checkbox "+ xpathExpression);

	}

	//Select Dropdown  
	public void selectDropdown(WebDriver driver, String xpathExpression, String inputVal) {

		Select sel = new Select(driver.findElement(By.xpath(xpathExpression)));
		sel.selectByVisibleText(inputVal);

		System.out.println("Selected Dropdown "+ xpathExpression + "-" + inputVal);

	}
	
	//Capturing Text
	public String getText(WebDriver driver, String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression)).getText();
			
	}

}
