package Action;

import org.openqa.selenium.WebDriver;

import UI.UI;

public class SeleniumAction extends UI{

	public SeleniumAction(WebDriver driver) {
		super.driver= driver;
	}
	
	public void StartPractising(){
		startPractisingButton().click();
	}

}
