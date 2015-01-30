package ar.com.proautomation.webdriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;


public class GoogleSearcher extends TestCase {

	private WebDriver driver;
	private static final String URL = "https://www.google.com.ar";
	private static final String SEARCH_INPUT = "q";
	private static final String SEARCH_BUTTON = "btnK";
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(URL);
	}
	
	public void testSearchInputIsPresent() {
		WebElement element = driver.findElement(By.name(SEARCH_INPUT));
		assertTrue(element.isDisplayed());
	}
	
	public void testSearchButtonIsPresent() {
		WebElement element = driver.findElement(By.name(SEARCH_BUTTON));
		assertTrue(element.isDisplayed());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
