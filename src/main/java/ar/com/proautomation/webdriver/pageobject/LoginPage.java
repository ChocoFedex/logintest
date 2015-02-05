package ar.com.proautomation.webdriver.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	private WebDriver driver = new FirefoxDriver();
	
	public void open(String url) {
		driver.get(url);
	}
	
	public String showTitle() {
		return driver.getTitle();
	}

	public boolean userFieldIsVisible() {
		return driver.findElement(By.id("Email")).isDisplayed();
	}
	
	public boolean passFieldIsVisible() {
		return driver.findElement(By.id("Passwd")).isDisplayed();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
}
