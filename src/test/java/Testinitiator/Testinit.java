package Testinitiator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Action.SeleniumAction;
import Utility.BasePage;

public class Testinit {
	
	public WebDriver driver;
	int timeout = 120;
	WebElement element;
	List<WebElement> elements;
	
	public BasePage startandlaunchBrowser(String url){
		System.setProperty("webdriver.gecko.driver","E:\\Projects\\SeleniumPract\\drivers\\geckodriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		SeleniumAction homepageactions = new SeleniumAction(driver);
		driver.get(url);
		return homepageactions;
	}
	
	public void quitDriver() {
		driver.quit();
	}

}
