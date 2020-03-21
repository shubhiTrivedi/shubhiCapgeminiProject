package com.capgemini.hcs.pi;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.exception.DiagnosticException;
import com.capgemini.hcs.exception.ValidateException;
import com.capgemini.hcs.service.HealthCareService;
import com.capgemini.hcs.service.HealthCareServiceImpl;

public class HealthCareCenterUI {
	static HealthCareService ser = new HealthCareServiceImpl();
	public static void main(String[] args) throws DiagnosticException {
		try {
		DiagnosticCenter centre = new DiagnosticCenter();
		centre.setCenterId("HYD1001");
		centre.setCenterName("Padmavathi Diagnostic Cdentre");
		ser.addDiagnosticCentre(centre);	
		
		System.out.println("ceters after adding  1 center into map");
		ser.getCentres().values().forEach(System.out::println);
		
		//-------------------adding one more center--------------------------------------//
		centre.setCenterId("KMM1001");
		centre.setCenterName("Apex Diagnostic Cdentre");
		ser.addDiagnosticCentre(centre);
		
		System.out.println("ceters after adding 2 center into map");
		ser.getCentres().values().forEach(System.out::println);}
		
		
		catch(ValidateException ex) {
			System.err.println(ex.getMessage());
		}
	}

	}

