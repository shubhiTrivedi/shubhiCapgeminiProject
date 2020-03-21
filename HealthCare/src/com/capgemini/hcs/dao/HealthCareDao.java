package com.capgemini.hcs.dao;

import java.util.Map;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.DiagnosticTestBean;
import com.capgemini.hcs.exception.DiagnosticException;

public interface HealthCareDao {
	public boolean addDiagnosticCentre(DiagnosticCenter center);

	public boolean addTest(DiagnosticCenter centre, DiagnosticTestBean test);

	public DiagnosticCenter viewDiagnosticCenter(String centreId) throws DiagnosticException;

	public Map<String, DiagnosticCenter> getCentres();


}
