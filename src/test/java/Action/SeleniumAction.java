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
	
	public void SimpleForm(String s){
		StartPractising();
		clickSimpleForm().click();
		enterYourMessage().sendKeys(s);
		showMessageButton().click();
		String m = yourMessage().getText();
		System.out.println(m);
		
		EnterA().sendKeys("10");
		EnterB().sendKeys("20");
		getTotalButton().click();
		String m1 = getTotalResult().getText();
		System.out.println(m1);
	}
	
	public void Checkbox(){
		inputForm().click();
		openCheckboxForm().click();
		singleCheckbox().click();
		String s = singleCheckboxMessage().getText();
		System.out.println(s);
		
		checkOption1().click();
//		checkAll().click();
	}

}
