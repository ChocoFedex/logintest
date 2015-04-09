import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MailLogin extends TestCase {
//	private static final String URL = "http://mail.globallogic.com";
//	private static final String LOGIN_INPUT = "p";
//	private static final String PASSWORD = "password";
//	private static final String PASSWORD_INPUT = "Summer2021";
//	private static final String WRONG_INPUT = "CalleFalsa123";
	private WebDriver driver;
	@SuppressWarnings("unused")
	private GlobalLogic gl;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		gl = new GlobalLogic(driver);
	}


	public void testLoginSuccesful(){
		driver.getCurrentUrl();
		assertTrue(driver.getCurrentUrl().contains("mail.google.com/mail"));
	}
	
//	public void testLoginNameIsPresent(){
//		WebElement element = driver.findElement(By.id(LOGIN_INPUT));
//		assertTrue(element.isDisplayed());
//	}
//	
//	public void testLoginPasswordIsPresent(){
//		WebElement element = driver.findElement(By.name("password"));
//		assertTrue(element.isDisplayed());
//	}
	
	
	
//	public void testLoginSuccesful(){
//		WebElement username = driver.findElement(By.id(LOGIN_INPUT));
//		username.sendKeys("federico.matavos");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys(PASSWORD_INPUT);
//		username.submit();
//		driver.getCurrentUrl();
//		assertTrue(driver.getCurrentUrl().contains("mail.google.com/mail"));
//	}	
//	
//	public void testLoginFailed(){
//		WebElement username = driver.findElement(By.id(LOGIN_INPUT));
//		username.sendKeys("federico.matavos");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys(WRONG_INPUT);
//		username.submit();
//		WebElement element = driver.findElement(By.id("error-msg"));
//		String strng = element.getText();
//		System.out.println(strng);
//		assertEquals("Login Failed. The LDAP username and/or password you entered was invalid", strng);
//	}

		@After
	    public void tearDown() {
	        driver.quit();
	    }
	}