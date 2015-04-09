package ar.com.testdriver.webdriver.pageobject;

public class goToMailPage {
	public void setUp() {
		loginPage = new LoginPage();
		loginPage.open("https://mail.google.com");
	}
}
