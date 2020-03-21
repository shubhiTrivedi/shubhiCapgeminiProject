package com.capgemini.hcs.dao;

import java.util.Map;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.DiagnosticTestBean;
import com.capgemini.hcs.exception.DiagnosticException;
import com.capgemini.hcs.pi.Repo;

public class HealthCareDaoImpl implements HealthCareDao {
	private Map<String, DiagnosticCenter> listofCenters = Repo.listcCenters;
	@Override
	public boolean addDiagnosticCentre(DiagnosticCenter centre) {
		try {
			DiagnosticCenter dcentre = viewDiagnosticCenter(centre.getCenterId());
			return false;
		} catch (DiagnosticException e) {
			listofCenters.put(centre.getCenterId(), centre);
		}

		return true;
	}
	public boolean addTest(DiagnosticCenter centre, DiagnosticTestBean test) {
		centre.getListOfTests().add(test);
		return true;
	}
	public DiagnosticCenter viewDiagnosticCenter(String centreId) throws DiagnosticException {
		if (!listofCenters.containsKey(centreId))
			throw new DiagnosticException("No Center found !!!!");

		return listofCenters.get(centreId);
	}
	@Override
	public Map<String, DiagnosticCenter> getCentres() {

		return listofCenters;
	}

}
