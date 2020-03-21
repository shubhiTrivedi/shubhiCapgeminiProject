package com.capgemini.hcs.dao.testing;
//JUnit test case

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DAOTestCases {
	   DAOTesting dt;
	   @Before
		public  void setUp() {
			dt = new DAOTesting();
		}

	
	//Testing methods
	@Test
	public void initialCapitalTestName() {
		Assert.assertEquals(true,dt.validTestName("CTScan"));
		
	}
	
	@Test
	public void testNameLength() {
		Assert.assertEquals(true,dt.validTestLength("Blood Sugar"));
		
	}
	@Test
	public void startWithCharTestName() {
		Assert.assertEquals(true,dt.validTestName1("ctscan"));
	}
	
	@Test
	public void validCenterIdTest() {
		Assert.assertEquals(true,dt.validCenterId("3"));
		
	}
	@Test
	public void validTestIdTest() {
		Assert.assertEquals(true,dt.validTestId("1","2"));
		
	}
	@Test
	public void validTestIdTestInteger() {
		Assert.assertEquals(false,dt.validTestId("1","ch"));
		
	}
	@Test
	public void validTestIdTestIntegerNegative() {
		Assert.assertEquals(false,dt.validTestId("1","-2"));
		
	}
	@Test
	public void validTestIdTestIntegerEmpty() {
		Assert.assertEquals(false,dt.validTestId("1",""));
		
	}
	
	@After
	public void cleanUp() {
		dt = null;
	}

}
