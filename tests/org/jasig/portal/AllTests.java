package org.jasig.portal;

import junit.framework.*;
import junit.runner.BaseTestRunner;
import org.jasig.portal.UPFileSpecTest;
import org.jasig.portal.layout.AllLayoutTests;

public class AllTests {

    public AllTests() {
    }


    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
	
    public static Test suite() {
        //TestSuite suite=new TestSuite(UPFileSpecTest.class);
        TestSuite suite= new TestSuite("uPortal Framework Tests");
        suite.addTestSuite(UPFileSpecTest.class);
        suite.addTest(AllLayoutTests.suite());
        return suite;
    }
}
