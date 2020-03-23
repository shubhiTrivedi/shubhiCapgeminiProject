package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.capgemini.hcs.bean.DiagnosticCenterBean;
import com.capgemini.hcs.bean.TestBean;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;
import com.capgemini.hcs.service.DiagnosticTestServiceImpl;

public class TestController {
	
	public static void addTest1() {
	
	DiagnosticTestServiceImpl diagnosticTestServiceImpl=new DiagnosticTestServiceImpl();
	try {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("The Centers Are:");
    
    for(DiagnosticCenterBean a:DiagnosticTestDAOImpl.getCenters()){
        System.out.print("Center ID-"+a.getCenterId()+"\t");
        System.out.println("Center Name-"+a.getCenterName());
        System.out.println("The Test for the above Center are");
        for(TestBean test:a.listOfTests){
            System.out.print("Test Id-"+test.testId+"\t");
            System.out.println("Test Name-"+test.getTestName());
            
             }
        System.out.println("\n");
    }
    System.out.println("Enter The Center ID to add Test");
    String id=br.readLine();
    String res=diagnosticTestServiceImpl.addTest(id);
    System.out.println(res);
   
}
catch(Exception e) {
	System.out.println(e);
	}
}


public static void removeTest1() {
		try {
			
			DiagnosticTestServiceImpl diagnosticTestServiceImpl=new DiagnosticTestServiceImpl();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The Centers Are:");
        for(DiagnosticCenterBean a: DiagnosticTestDAOImpl.getCenters()){
            System.out.print("Center ID-"+a.getCenterId()+"\t");
            System.out.println("Center Name-"+a.getCenterName());
            System.out.println("The Test for the above Center are");
            for(TestBean test:a.listOfTests){
                System.out.print("Test Id-"+test.testId+"\t");
                System.out.println("Test Name-"+test.getTestName());            
             }
            System.out.println("\n");
        }
        System.out.println("Enter The Center ID and Test ID to Remove Test");
        String cId=br.readLine();
        String tId=br.readLine();
        Boolean result=diagnosticTestServiceImpl.removeTest(cId,tId);
        System.out.println(result);
}catch(Exception e) {
	System.out.println(e);
}}










}