package com.capgemini.hcs.service.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTestCases {

	ServiceTesting st;
	   @Before
		public  void setUp() {
			st = new ServiceTesting();
		}
	   
	   @Test
		public void validCenterIdTesting() {
			Assert.assertEquals(true,st.validateCenterId("5"));
			
		}
		@Test
		public void validTestIdTesting() {
			Assert.assertEquals(true,st.validateTestId("1","3"));
			
		}
		
		@After
		public void cleanUp() {
			st = null;
		}

}
