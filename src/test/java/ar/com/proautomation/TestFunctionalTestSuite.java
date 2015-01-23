package ar.com.proautomation;

import java.util.List;

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
    	List<String> currentTests = this.testSuite.getContainedTestNames();
        assertEquals("successful login", currentTests.get(0));
    }
    
    public void testAddTestEmptyName() {
        this.testSuite.addTest(null);
        List<String> currentTests = this.testSuite.getContainedTestNames();

        assertEquals(1, currentTests.size());
    }
    
    public void testRemoveTest() {
        this.testSuite.removeTest("successful login");
        List<String> currentTests = this.testSuite.getContainedTestNames();

        assertEquals(0, currentTests.size());
    }

}
