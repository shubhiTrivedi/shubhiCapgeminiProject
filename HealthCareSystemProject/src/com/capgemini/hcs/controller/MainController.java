package com.capgemini.hcs.controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainController {
	public static void main(String args[]){
		try{
	        	char ch='\0';
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            Boolean outerExit=false;
	            do{
	            	System.out.println("**********WELCOME TO HEALTH CARE SYSTEM**********\n");
	                System.out.println("Enter 1 for Admin");
	                System.out.println("Enter 2 to Exit");
	                 ch=br.readLine().charAt(0);
	                
	                switch(ch){
	                case '1':
	                	InputController inputController=new InputController();
	                	inputController.inputFromUser();
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
