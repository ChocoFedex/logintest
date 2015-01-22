package ar.com.proautomation;

public class FunctionalTestSuite {

	private int containedTests = 0;
	
	public void addTest(String name) {
		if (name != null) {
			this.containedTests += 1;
		}
	}
	
	public void removeTest() {
		this.containedTests -= 1;
	}
	
	public int getContainedTests() {
		return this.containedTests;
	}
}
