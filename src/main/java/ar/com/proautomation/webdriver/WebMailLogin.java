package ar.com.proautomation.webdriver;

import org.junit.After;
import org.junit.Before;

import ar.com.proautomation.webdriver.pageobject.LoginPage;
import junit.framework.TestCase;

public class WebMailLogin extends TestCase {

	private LoginPage loginPage;
	
	@Before
	public void setUp() {
		loginPage = new LoginPage();
		loginPage.open("https://mail.google.com");
	}
	
	public void testWebMailIsAvailable() {
		assertTrue(loginPage.showTitle().equals("Gmail"));
	}
	
	public void testLoginFieldsAreAvailable() {
		assertTrue(loginPage.userFieldIsVisible());
		assertTrue(loginPage.passFieldIsVisible());
	}
	
	@After
	public void tearDown() {
		loginPage.quitBrowser();
	}
}
