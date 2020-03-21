package com.capgemini.hcs.service;

import java.util.Map;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.DiagnosticTestBean;
import com.capgemini.hcs.exception.DiagnosticException;
import com.capgemini.hcs.exception.ValidateException;

public interface HealthCareService {
	public boolean addDiagnosticCentre(DiagnosticCenter centre) throws ValidateException;

	public boolean addTest(String centreId, DiagnosticTestBean test) throws DiagnosticException, ValidateException;
	

	public Map<String, DiagnosticCenter> getCentres();

}
