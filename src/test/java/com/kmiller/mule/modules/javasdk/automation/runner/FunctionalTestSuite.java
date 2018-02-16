package com.kmiller.mule.modules.javasdk.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.kmiller.mule.modules.javasdk.automation.functional.AddEntityTestCases;
import com.kmiller.mule.modules.javasdk.automation.functional.GreetTestCases;
import com.kmiller.mule.modules.javasdk.automation.functional.QueryProcessorTestCases;
import com.kmiller.mule.modules.javasdk.JavaSDKConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({
	AddEntityTestCases.class,

GreetTestCases.class
	,QueryProcessorTestCases.class
})

public class FunctionalTestSuite {
	
	@BeforeClass
	public static void initialiseSuite(){
		ConnectorTestContext.initialize(JavaSDKConnector.class);
	}
	
	@AfterClass
    public static void shutdownSuite() {
    	ConnectorTestContext.shutDown();
    }
	
}