package com.capgemini.hcs.controller.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ControllerTestCases {

	
		   ControllerTesting ct;
		   @Before
			public  void setUp() {
				ct = new ControllerTesting();
			}
		   
		   @Test
			public void validateChoice() {
			   Assert.assertEquals(true,ct.validChoice(1));
				
			}
		   @Test
			public void validateChoice1() {
			   Assert.assertEquals(true,ct.validChoice1(4));
				
			}
		   
		  
		   
		   @After
			public void cleanUp() {
				ct = null;
			}


}
