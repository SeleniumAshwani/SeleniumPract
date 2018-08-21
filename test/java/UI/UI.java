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

}
