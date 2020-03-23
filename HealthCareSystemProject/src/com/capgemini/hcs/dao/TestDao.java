package com.capgemini.hcs.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDao {
	DiagnosticTestDAOImpl diagnosticTestDAOImpl;
	@Before
	public void setUp() throws Exception {
		diagnosticTestDAOImpl=new DiagnosticTestDAOImpl();
	}


	/*@Test
	public void testAddTest() {
		String addTestStatus=diagnosticTestDAOImpl.addTest("1");
		assertEquals("Test Added Successfully",addTestStatus);
	}*/
	
	@Test
	public void testRemoveTest() {
		boolean removeTestStatus=diagnosticTestDAOImpl.removeTest("1", "3");
		assertEquals(true,removeTestStatus);
	}

	
	@After
	public void tearDown() throws Exception {
		diagnosticTestDAOImpl=null;
	}


}
