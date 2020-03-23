package com.capgemini.hcs.controller.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ControllerTestCases {

	
		   ControllerTesting controllerTesting;
		   @Before
			public  void setUp() {
			   controllerTesting = new ControllerTesting();
			}
		   
		   @Test
			public void testValidChoice() {
			   Assert.assertEquals(true,controllerTesting.validChoice(1));
				
			}
		   @Test
			public void testValidSubChoice() {
			   Assert.assertEquals(true,controllerTesting.validChoice1(4));
				
			}
		   @After
			public void cleanUp() {
			   controllerTesting = null;
			}


}
