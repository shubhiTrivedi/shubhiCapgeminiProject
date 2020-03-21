package com.capgemini.hcs.service;

import java.util.Map;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.DiagnosticTestBean;
import com.capgemini.hcs.dao.HealthCareDao;
import com.capgemini.hcs.dao.HealthCareDaoImpl;
import com.capgemini.hcs.exception.DiagnosticException;
import com.capgemini.hcs.exception.ValidateException;

public class HealthCareServiceImpl implements HealthCareService {
	private HealthCareDao dao = new HealthCareDaoImpl();
	@Override
	public boolean addDiagnosticCentre(DiagnosticCenter centre) throws ValidateException {
		// validating the diagnostic CentreId
		if (validateCenter(centre)) {
			return dao.addDiagnosticCentre(centre);
		}
		return false;

	}
	@Override
	public boolean addTest(String centreId, DiagnosticTestBean test) throws DiagnosticException, ValidateException {
		if (validateTest(test)) {
			DiagnosticCenter centre = dao.viewDiagnosticCenter(centreId);
			dao.addTest(centre, test);
			return true;
		}
		return false;
	}
	@Override
	public Map<String, DiagnosticCenter> getCentres() {

		return dao.getCentres();
	}
	public boolean validateCenter(DiagnosticCenter cent) throws ValidateException {
		if (!cent.getCenterId().matches("[a-zA-Z]{3}[0-9]{4}"))
			throw new ValidateException("First Three Character should be alphabet and rest 4 numbers");
		return true;
	}

	public boolean validateTest(DiagnosticTestBean test) throws ValidateException {
		if (!test.getTestId().matches("[a-zA-Z]{3}"))
			throw new ValidateException("First Three Character should be alphabet and rest 4 numbers");
		return true;
	}
}