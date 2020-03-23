package com.capgemini.hcs.service.testing;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTestCases {

	ServiceTesting serviceTesting;
	   @Before
		public  void setUp() {
		   serviceTesting = new ServiceTesting();
		}
	   
	   @Test
		public void testValidCenterId() {
			Assert.assertEquals(true,serviceTesting.validateCenterId("5"));
			
		}
		@Test
		public void testValidTestId() {
			Assert.assertEquals(true,serviceTesting.validateTestId("1","3"));
			
		}
		
		@After
		public void cleanUp() {
			serviceTesting = null;
		}

}
