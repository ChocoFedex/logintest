import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalLogic {
	private static final String URL = "http://mail.globallogic.com";
	private static final String LOGIN_INPUT = "p";
	private static final String PASSWORD = "password";
	private static final String PASSWORD_INPUT = "Summer2021";
	private static final String WRONG_INPUT = "CalleFalsa123";
	private WebDriver driver;

	public GlobalLogic(WebDriver driver){
		this.driver = driver;
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id(LOGIN_INPUT));
		element.sendKeys("federico.matavos");
		WebElement passwordfield = driver.findElement(By.name(PASSWORD));
		passwordfield.sendKeys(PASSWORD_INPUT);
		element.submit();
	}

}
