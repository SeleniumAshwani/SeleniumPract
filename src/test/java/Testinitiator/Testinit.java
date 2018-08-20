package Testinitiator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.BasePage;

public class Testinit {
	
	public WebDriver driver;
	int timeout = 120;
	WebElement element;
	List<WebElement> elements;
	
	public BasePage startandlaunchBrowser(String url){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		BasePage homepageactions = new BasePage();
		driver.get(url);
		return homepageactions;
	}
	
	public void quitDriver() {
		driver.quit();
	}

}
