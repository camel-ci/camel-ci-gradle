package com.ci.gradle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void testApp() {
        assertTrue( true );
    }

    @org.junit.Test
    void checkBissextile(){
        assertEquals(" ", App.estBissextile(2010));
    }
}
