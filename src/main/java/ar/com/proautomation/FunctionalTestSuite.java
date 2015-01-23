package ar.com.proautomation;

import java.util.ArrayList;
import java.util.List;

public class FunctionalTestSuite {

	private List<String> testCases = new ArrayList<String>();
	
	public void addTest(String name) {
		if (name != null) {
			this.testCases.add(name);
		}
	}
	
	public void removeTest(String name) {
		this.testCases.remove(name);
	}
	
	public List<String> getContainedTestNames() {
		return this.testCases;
	}
}
