package com.capgemini.hcs.controller;
import java.io.BufferedReader;

import java.io.InputStreamReader;

import com.capgemini.hcs.bean.DiagnosticCenters;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;
import com.capgemini.hcs.repository.CentersRepository;
import com.capgemini.hcs.service.DiagnosticTestServiceImpl;
public class MainController {
	
	 public static void main(String args[]){
		 CentersRepository c=new CentersRepository();
		 String result="";
		 boolean flag=false;
	        try{
	        	
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            Boolean outerExit=false;
	            do{
	            	System.out.println("**********WELCOME TO HEALTH CARE SYSTEM**********\n");
	                System.out.println("Enter 1 for Admin");
	                System.out.println("Enter 2 to Exit");
	                char ch=br.readLine().charAt(0);
	                
	                switch(ch){
	                case '1':
	                	
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
                            	
                            	DiagnosticCenters.addCenter();
	                            break;
	                                           
	                        case '2':
	                        	
	                        	if(DiagnosticTestDAOImpl.centers.size()!=0) 
	                        	{
	                        		result=h.addTest();
                    				System.out.println(result);
                    				
                    			}
	                            else
	                                System.out.println("Center list is empty, please add center first!");
	                        	break;
	                        case '3':
	                        	
	                        	if(DiagnosticTestDAOImpl.centers.size()!=0)
	                        	{
	                        		flag=h.removeTest();
	                                System.out.println(flag);
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
	                            break;
	                            
	                            
	                    
	                 case '2':
	                	 System.out.println("------Exiting from the system------\n------Good Bye!!Have a Nice Day!!------\n");
                         outerExit=true;
                         break;
	                 default:
                         System.out.println("------Wrong choice!!Enter a valid choice------\n");
	                }
	            }
	            while(!outerExit);
	        }
	        catch (Exception e)
	        {
	        	System.out.println(e.getMessage());
	        }
	 }


}
