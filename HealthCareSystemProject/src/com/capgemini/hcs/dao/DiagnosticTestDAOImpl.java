package com.capgemini.hcs.dao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.TestBean;
import com.capgemini.hcs.exception.EmptyTestListException;
import com.capgemini.hcs.exception.InvalidCenterIdException;
import com.capgemini.hcs.exception.InvalidTestIdException;
import com.capgemini.hcs.exception.TestNameException;
import com.capgemini.hcs.repository.CentersRepository;
public class DiagnosticTestDAOImpl implements IDiagnosticTestDAO {
	
		public static ArrayList<DiagnosticCenter> centers=new ArrayList<DiagnosticCenter>(); ;
		

		CentersRepository cr=new CentersRepository();
		//Method for adding the test at a particular center
		
		@Override
	    public String addTest(){
	    	 String s1="";
	        try {
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("The Centers Are:");
	            
	            for(DiagnosticCenter a:centers){
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
	            int found=0;
	            for(DiagnosticCenter a:centers){
	                if (a.getCenterId().equals(id)){
	                    System.out.println("Enter The Test Name");
	                    String test=br.readLine();
	                    if(test.length()==0)
	                    {
	                    	throw new TestNameException();
	                    }
	                    else if(!((test.charAt(0)>=65) && (test.charAt(0)<=90))) {
	                    	throw new TestNameException();
	                    }
	                  
	                    else {}
	                    a.listOfTests.add(new TestBean(test));
	                    found=1;
	                    s1="Test Added Successfully";
	                    break;
	                }
	            }
	            if (found==0){
	            	throw new InvalidCenterIdException();
	            }
	        } catch (Exception e) {
	            
	            System.out.println(e);
	        }
	        return s1;
	    }
	    
	    //Method for removing a test from a particular center
		@Override
	    public boolean removeTest(){
	    	boolean res=false;
	        try {
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("The Centers Are:");
	            for(DiagnosticCenter a: centers){
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
	            String tID=br.readLine();
	            int foundT=0,foundC=0,tempt=0;
	            for(DiagnosticCenter a:centers){
	                if (a.getCenterId().equals(cId)){
	                    foundC=1;
	                    if(a.listOfTests.size()==0){
	                       
	                        throw new EmptyTestListException();
	                       
	                    }
	                    else{
	                    	for(TestBean test:a.listOfTests){
	                    		if (test.testId.equals(tID)){
	                    			a.listOfTests.remove(test);
	                    			foundT=1;
	                    			System.out.println("Test Removed Succesfully");
	                    			res=true;
	                    			break;
	                    		}
	                    	}
	                    	if (foundC==1){
	                    		break;
	                    	}
	                    }
	                }
	            }
	            if (foundC==0){
	                
	            	throw new InvalidCenterIdException();
	            }
	            if(foundC==1 && foundT==0 && tempt==0){
	                
	            	throw new InvalidTestIdException();
	            }
	            
	        }
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
	        return res;
	    }
		
}
