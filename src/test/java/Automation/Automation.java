package Automation;

import org.testng.annotations.BeforeTest;

import Action.SeleniumAction;
import Testinitiator.Testinit;

public class Automation {
	
	Testinit testinit = new Testinit();
	SeleniumAction action = null;
	
	@BeforeTest
	public void launchSelenium(){
		testinit.startandlaunchBrowser("http://www.seleniumeasy.com/test/");
		action = new SeleniumAction(testinit.driver);
	}
	
	public void startForm(){
		action.StartPractising();
	}
	
}
