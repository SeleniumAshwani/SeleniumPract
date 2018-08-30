package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BasePage;

public class UI extends BasePage{
	
	WebElement element;
	List<WebElement> elements;

	public WebElement startPractisingButton() {
		return ExplicitWait(By.xpath(".//*[@id='btn_basic_example']"));
	}

	//<------------------Simple Form----------------------->
	
	public WebElement clickSimpleForm() {
		return ExplicitWait(By.xpath("(//a[contains(.,'Simple Form Demo')])[3]"));
	}
	
	public WebElement enterYourMessage() {
		return ExplicitWait(By.xpath("//input[contains(@id,'user-message')]"));
	}
	
	public WebElement showMessageButton() {
		return ExplicitWait(By.xpath("//button[contains(.,'Show Message')]"));
	}
	
	public WebElement yourMessage() {
		return ExplicitWait(By.xpath("//div[@id='user-message']"));
	}
	
	public WebElement EnterA() {
		return ExplicitWait(By.xpath("//input[@id='sum1']"));
	}
	
	public WebElement EnterB() {
		return ExplicitWait(By.xpath("//input[@id='sum2']"));
	}
	
	public WebElement getTotalButton() {
		return ExplicitWait(By.xpath("//button[contains(.,'Get Total')]"));
	}
	
	public WebElement getTotalResult() {
		return ExplicitWait(By.xpath(".//*[@id='displayvalue']"));
	}
	
	//<------------------Checkbox Form----------------------->
	
	public WebElement inputForm() {
	return ExplicitWait(By.xpath("(//a[contains(.,'Input Forms')])[2]"));
	}

	public WebElement openCheckboxForm() {
		return ExplicitWait(By.xpath("(//a[contains(.,'Checkbox Demo')])[2]"));
	}

	
	public WebElement singleCheckbox() {
		return ExplicitWait(By.xpath("//input[@id='isAgeSelected']"));
	}
	
	public WebElement singleCheckboxMessage() {
		return ExplicitWait(By.xpath("//div[contains(@id,'txtAge')]"));
	}
	
	public WebElement checkOption1() {
		return ExplicitWait(By.xpath("(//input[@class='cb1-element'])[1]"));
	}

	//<------------------Radio Button Form----------------------->
	
	public WebElement openRadioButtonForm() {
		return ExplicitWait(By.xpath("(//a[@href='./basic-radiobutton-demo.html'])[2]"));
	}
	
	public WebElement radioButtonDemo() {
		return ExplicitWait(By.xpath(".//input[@name='optradio'][@value='Male']"));
	}
	
	public WebElement getCheckedValue() {
		return ExplicitWait(By.xpath("//button[@id='buttoncheck']"));
	}
	
	public WebElement getCheckedMessage() {
		return ExplicitWait(By.xpath(".//*[@class='radiobutton']"));
	}
	
	public WebElement groupRadioButtonDemoSex() {
		return ExplicitWait(By.xpath(".//input[@name='gender'][@value='Female']"));
	}
	
	public WebElement groupRadioButtonDemoAgeGroup() {
		return ExplicitWait(By.xpath(".//input[@name='ageGroup'][@value='5 - 15']"));
	}
	
	public WebElement getValues() {
		return ExplicitWait(By.xpath("//button[@type='button'][contains(.,'Get values')]"));
	}
	
	public WebElement getValuesMessage() {
		return ExplicitWait(By.xpath(".//*[@class='groupradiobutton']"));
	}

}
