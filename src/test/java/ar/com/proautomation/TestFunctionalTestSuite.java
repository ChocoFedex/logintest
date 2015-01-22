package ar.com.proautomation;

import org.junit.Before;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFunctionalTestSuite extends TestCase {
	
	private FunctionalTestSuite testSuite;
	
    public TestFunctionalTestSuite( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( TestFunctionalTestSuite.class );
    }

    @Before
    public void setUp() {
        this.testSuite = new FunctionalTestSuite();
        this.testSuite.addTest("successful login");
    }
    
    public void testAddTest() {
        int currentTests = this.testSuite.getContainedTests();

        assertEquals(1, currentTests);
    }
    
    public void testAddTestEmptyName() {
        this.testSuite.addTest(null);
        int currentTests = this.testSuite.getContainedTests();

        assertEquals(1, currentTests);
    }
    
    public void testRemoveTest() {
        this.testSuite.removeTest();
        int currentTests = this.testSuite.getContainedTests();

        assertEquals(0, currentTests);
    }

}
