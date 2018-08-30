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
		System.out.println("<----------------Simple Form test successfully-------------->");
	}
	
	public void Checkbox(){
		inputForm().click();
		openCheckboxForm().click();
		singleCheckbox().click();
		String s = singleCheckboxMessage().getText();
		System.out.println(s);
		
		checkOption1().click();
//		checkAll().click();
		System.out.println("<----------------Checkbox Form test successfully--------------------->");
	}
	
	public void RadioButton(){
		inputForm().click();
		openRadioButtonForm().click();
		radioButtonDemo().click();
		getCheckedValue().click();
		String s = getCheckedMessage().getText();
		System.out.println(s);
		
		groupRadioButtonDemoSex().click();
		groupRadioButtonDemoAgeGroup().click();
		getValues().click();
		String s1 = getValuesMessage().getText();
		System.out.println(s1);
		System.out.println("<--------------Radio Button Form test successfully--------------->");
	}

}
