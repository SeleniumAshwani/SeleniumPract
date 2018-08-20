package Action;

import org.openqa.selenium.WebDriver;

import UI.UI;

public class SeleniumAction extends UI{

	public SeleniumAction(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	public void StartPractising(){
		startPractisingButton().click();
	}

}
