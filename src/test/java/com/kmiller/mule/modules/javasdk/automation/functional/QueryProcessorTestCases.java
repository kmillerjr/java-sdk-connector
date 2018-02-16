package com.kmiller.mule.modules.javasdk.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.kmiller.mule.modules.javasdk.JavaSDKConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class QueryProcessorTestCases extends
		AbstractTestCase<JavaSDKConnector> {

	public QueryProcessorTestCases() {
		super(JavaSDKConnector.class);
	}
    
	@Before
	public void setup() {
		// TODO
	}

	@After
	public void tearDown() {
		// TODO
	}

    @Test
    public void verify() {
        java.util.List<java.lang.Object> expected = null;
		java.lang.String query = null;
		assertEquals(getConnector().queryProcessor(query), expected);
    }
    
}