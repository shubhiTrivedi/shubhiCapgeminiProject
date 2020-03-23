package com.capgemini.hcs.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;
import com.capgemini.hcs.repository.CentersRepository;
import com.capgemini.hcs.service.DiagnosticTestServiceImpl;

public class InputController {
	public void inputFromUser() {
		
		CentersRepository c=new CentersRepository();
		
		 String result="";
				
			        try{
			        	
			            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			            Boolean exit=false;
		                        do{
		                        	System.out.println("********ADMIN MODULE******** \n ");
		                        	System.out.println("Enter 1 to Add Center");
		                            System.out.println("Enter 2 to Add Test at a particular Center");
		                            System.out.println("Enter 3 to Remove Test from a particular Center");
		                            System.out.println("Enter 4 to Exit from the Admin Account");
		                            char ch1=br.readLine().charAt(0);
		                            DiagnosticTestServiceImpl h=new DiagnosticTestServiceImpl();
		                            switch(ch1){
		                           case '1':
		                            	
		                            	DiagnosticCenter.addCenter();
			                            break;
			                                           
			                        case '2':
			                        	
			                        	if(DiagnosticTestDAOImpl.getCenters().size()!=0) 
			                        	{
			                        		TestController.addTest1();
		                    				System.out.println(result);
		                    				
		                    			}
			                            else
			                                System.out.println("Center list is empty, please add center first!");
			                        	break;
			                        case '3':
			                        	
			                        	if(DiagnosticTestDAOImpl.getCenters().size()!=0)
			                        	{
			                        		TestController.removeTest1();
			                                
			                            }
			                            else
			                                System.out.println("Center list is empty, please add center first!");
			                                break;
			                                           
			                         case '4':
			                        	 System.out.println("Exiting you from the admin account");
			                             exit=true;
			                             break;
			                         default: System.out.println("------Wrong choice!!Enter a valid choice------");
		                            }
		                        }
		                        while(!exit);
			              }
			        catch (Exception e)
			        {
			        	System.out.println(e.getMessage());
			        }
	}
	

}
