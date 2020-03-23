package com.capgemini.hcs.dao.testing;
//JUnit test case

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DAOTestCases {
	   DAOTesting daoTesting;
	   @Before
		public  void setUp() {
		   daoTesting = new DAOTesting();
		}

	
	//Testing methods
	@Test()
	public void testInitialCapitalTestName() {
		Assert.assertEquals(true,daoTesting.validTestName("CTScan"));
		
	}
	
	@Test
	public void testTheTestNameLength() {
		Assert.assertEquals(true,daoTesting.validTestLength("Blood Sugar"));
		
	}
	@Test
	public void testStartWithCharTestName() {
		Assert.assertEquals(true,daoTesting.validTestName1("ctscan"));
	}
	
	@Test
	public void testValidCenterIdTest() {
		Assert.assertEquals(true,daoTesting.validCenterId("3"));
		
	}
	@Test
	public void testValidTestIdTest() {
		Assert.assertEquals(true,daoTesting.validTestId("1","2"));
		
	}
	@Test
	public void testValidTestIdInteger() {
		Assert.assertEquals(false,daoTesting.validTestId("1","ch"));
		
	}
	@Test
	public void testValidTestIdIntegerNegative() {
		Assert.assertEquals(false,daoTesting.validTestId("1","-2"));
		
	}
	@Test
	public void testValidTestIdEmpty() {
		Assert.assertEquals(false,daoTesting.validTestId("1",""));
		
	}
	
	@After
	public void cleanUp() {
		daoTesting = null;
	}

}
