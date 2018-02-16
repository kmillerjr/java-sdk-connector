package com.kmiller.mule.modules.javasdk.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.kmiller.mule.modules.javasdk.JavaSDKConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class GreetTestCases extends
		AbstractTestCase<JavaSDKConnector> {

	public GreetTestCases() {
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
		java.lang.String expected = null;
		java.lang.String friend = null;
		assertEquals(getConnector().greet(friend), expected);
	}

}